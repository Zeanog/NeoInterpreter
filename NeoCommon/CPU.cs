using System;
using System.Collections.Generic;
using System.Runtime.Serialization;

namespace Neo {
    public abstract class IMemoryDecorator
    {
        protected static Dictionary<string, Type> m_TypeMap = new Dictionary<string, Type>();
        static IMemoryDecorator()
        {
            m_TypeMap.Add("int", typeof(int));
            m_TypeMap.Add("float", typeof(float));
        }

        // YUK - I hate having parms that only some children use.  BAD BAD BAD!!!
        public abstract Value AllocateStorage(string name, Type type, FunctionDef funcDef);
        public virtual Value AllocateStorage(string name, Type type)
        {
            return AllocateStorage(name, type, null);
        }

        public virtual Value AllocateStorage(string name, string typeName, FunctionDef funcDef)
        {
            try
            {
                return AllocateStorage(name, m_TypeMap[typeName], funcDef);
            }
            catch(Exception ex)
            {
                return null;
            }
        }
        public virtual Value AllocateStorage(string name, string typeName)
        {
            return AllocateStorage(name, typeName, null);
        }
    }

    public class MemoryDecorator_HeapInterface : IMemoryDecorator
    {
        public override Value AllocateStorage(string name, Type type, FunctionDef funcDef)
        {
            CPU.Instance.Heap.Add(new LiteralValue());
            Value val = new MemoryValue(typeof(int), CPU.Instance.Heap.Count - 1);
            ProgramDef.Instance.SymbolTable.Add(name, val);
            return val;
        }
    }

    public class MemoryDecorator_StackInterface : IMemoryDecorator
    {
        public MemoryDecorator_StackInterface()
        {
            ProgramDef.Instance.ClearStackFrameCount();
        }

        public override Value AllocateStorage(string name, Type type, FunctionDef funcDef)
        {
            Value val = ProgramDef.Instance.AllocateStackValue(type, funcDef);
            ProgramDef.Instance.SymbolTable.Add(name, val);
            return val;
        }
    }

    public class StackFrame
    {
        protected List<LiteralValue> stack = new List<LiteralValue>();

        public StackFrame(int size)
        {
            for (int ix = 0; ix < size; ++ix)
            {
                stack.Add( new LiteralValue() );
            }
        }

        public int Count
        {
            get
            {
                return stack.Count;
            }
        }

        public void PushOntoStack(Value val)
        {
            LiteralValue stackVal = new LiteralValue();
            Value.Copy(stackVal, val);
            stack.Add( stackVal );
        }

        public LiteralValue PopOffStack()
        {
            if (stack.Count <= 0)
            {
                throw new StackOverflowException();// Should be StackUnderflow but for now
            }
            LiteralValue stackVal = stack[stack.Count - 1];
            stack.RemoveAt(stack.Count - 1);
            return stackVal;
        }

        public LiteralValue this[int index] {
            get {
                return stack[index];
            }

            set {
                stack[index] = value;
            }
        }
    }

    [Serializable]
    public class CPU : ISerializable {
        private static CPU m_Instance = null;
        public static CPU Instance {
            get {
                if( m_Instance == null ) {
                    m_Instance = new CPU();
                }
                return m_Instance;
            }
        }

        public List<StackFrame>     StackFrames = new List<StackFrame>();

        public List<LiteralValue>   Heap = new List<LiteralValue>();
        public LiteralValue[]       Registers = new LiteralValue[5];

        public List<Instruction>    InstructionStream = new List<Instruction>();
        public int                  CurrentInstructionIndex = 0;

        public int                  FunctionCodeBase;

        public CPU() {
        }

        public CPU( SerializationInfo info, StreamingContext context ) {
            m_Instance = this;
            InstructionStream = (List<Instruction>)info.GetValue( "InstructionStream", typeof(List<Instruction>) );
            Heap = (List<LiteralValue>)info.GetValue( "Heap", typeof(List<LiteralValue>) );
            FunctionCodeBase = info.GetInt32( "FunctionCodeBase" );
        }

        public virtual void GetObjectData( SerializationInfo info, StreamingContext context ) {
            info.AddValue( "InstructionStream", InstructionStream );
            info.AddValue( "Heap", Heap );
            info.AddValue( "FunctionCodeBase", FunctionCodeBase );
        }

        public StackFrame CurrentStackFrame {
            get {
                if (StackFrames.Count <= 0)
                {
                    StackFrames.Add(new StackFrame(0));
                }
                return StackFrames[StackFrames.Count - 1];
            }
        }

        public int PushOntoStack( Value val ) {
            LiteralValue stackVal = new LiteralValue();
            Value.Copy(stackVal, val);
            CurrentStackFrame.PushOntoStack(stackVal);
            return CurrentStackFrame.Count - 1;
        }

        public LiteralValue PopOffStack() {
            return CurrentStackFrame.PopOffStack();
        }

        public void PushFrameOntoStack( int frameSize ) {
            StackFrames.Add(new StackFrame(frameSize));
        }

        public void PopFrameOffStack() {
            StackFrames.RemoveAt(StackFrames.Count - 1);
        }

        public void Initialize() {
            for( int ix = 0; ix < Registers.Length; ++ix ) {
                Registers[ix] = new LiteralValue();
            }
        }

        public void     ExecuteCycles() {
            Instruction currentInstruction = null;

            CurrentInstructionIndex = 0;

            if( InstructionStream == null || InstructionStream.Count <= 0 ) {
                return;
            }

            // Need to get null instruction when done
            while( CurrentInstructionIndex < InstructionStream.Count ) {
                currentInstruction = InstructionStream[ CurrentInstructionIndex++ ];
                if (currentInstruction == null || !currentInstruction.Execute(this)) {
                    return;
                }
            }
        }
    }
}
