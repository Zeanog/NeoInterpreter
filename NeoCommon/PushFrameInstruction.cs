using System;
using System.IO;
using System.Runtime.Serialization;

namespace Neo
{
    [Serializable]
    public class PushFrameInstruction : Instruction
    {
        public PushFrameInstruction(Value frameSize)
            : base(frameSize)
        {
            
        }

        public PushFrameInstruction(SerializationInfo info, StreamingContext context)
            : base(info, context)
        {

        }

        public override bool    Execute( CPU cpu ) {
            cpu.PushFrameOntoStack( Operands[0].Get<Int32>() );
            return true;
        }
    }

    [Serializable]
    public class PopFrameInstruction : Instruction
    {
        public PopFrameInstruction()
            : base()
        {

        }

        public PopFrameInstruction(SerializationInfo info, StreamingContext context)
            : base(info, context)
        {

        }

        public override bool Execute(CPU cpu)
        {
            cpu.PopFrameOffStack();
            return true;
        }
    }
}
