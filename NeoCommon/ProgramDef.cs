using System;
using System.Collections.Generic;

namespace Neo
{
    public class FunctionDefCollection
    {
        protected Dictionary<string, FunctionDef> functionDefs = new Dictionary<string, FunctionDef>();
        protected FunctionDef lastDefRegistered;

        public void Create(string name, int numParameters, int stackFrameSize)
        {
            FunctionDef funcDef = new FunctionDef(name, lastDefRegistered);
            funcDef.StackFrameSize = stackFrameSize;
            funcDef.NumParameters = numParameters;
            lastDefRegistered = funcDef;
            functionDefs.Add(name, funcDef);
        }

        public void AppendToStream(List<Instruction> instructionStream)
        {
            foreach (KeyValuePair<string, FunctionDef> def in functionDefs)
            {
                CPU.Instance.InstructionStream.AddRange(def.Value.InstructionStream);
            }
        }

        public void Clear()
        {
            functionDefs.Clear();
            lastDefRegistered = null;
        }

        public FunctionDef this[string key]
        {
            get
            {
                return functionDefs[key];
            }
        }
    }

    public class ProgramDef
    {
        private static ProgramDef instance = null;
        public static ProgramDef Instance
        {
            get
            {
                if (instance == null)
                {
                    instance = new ProgramDef();
                }
                return instance;
            }
        }

        public Dictionary<string, Value> SymbolTable = new Dictionary<string, Value>();
        public Stack<Value> ReturnStack = new Stack<Value>();
        public FunctionDefCollection FunctionDefs = new FunctionDefCollection();

        protected LinkedList<string> scopes = new LinkedList<string>();
        protected int stackFrameIndex;

        protected ProgramDef()
        {
            scopes.Clear();
            scopes.AddLast("global");
        }

        protected void PushScope(string scope)
        {
            scopes.AddLast(string.Format("{0}.{1}", scopes.Last.Value, scope));
        }
		
        protected void PopScope()
        {
            scopes.RemoveLast();
        }
		
        protected Value GetSymbolValue(string name)
        {
            foreach (string scope in scopes)
            {
                try
                {
                    return SymbolTable[string.Format("{0}.{1}", scope, name)];
                }
                catch (KeyNotFoundException)
                {
                    continue;
                }
            }

            throw new SymbolNotFoundException();
        }

        protected string NameToSymbolName(string name)
        {
            return string.Format("{0}.{1}", scopes.Last.Value, name);
        }

        protected MemoryValue AllocateMemoryValue(Type type)
        {
            return new MemoryValue(type, CPU.Instance.Heap.Count - 1);
        }

        public MemoryValue AllocateStackValue(Type type, FunctionDef funcDef)
        {
            int offset = funcDef != null ? funcDef.StackFrameSize : 0;
            MemoryValue val = new StackValue(type, stackFrameIndex + offset);
            //++stackFrameIndex;
            return val;
        }

        public void ClearStackFrameCount()
        {
            stackFrameIndex = 0;
        }
    }
}
