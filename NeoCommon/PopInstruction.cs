using System;
using System.IO;
using System.Runtime.Serialization;

namespace Neo
{
    [Serializable]
    public class PopInstruction : Instruction
    {
        public PopInstruction()
            : base(null)
        {

        }

        public PopInstruction(Value dst)
            : base(dst)
        {

        }

        public PopInstruction(SerializationInfo info, StreamingContext context)
            : base(info, context)
        {

        }

        public override bool Execute(CPU cpu)
        {
            LiteralValue val = cpu.PopOffStack();
            if (Operands.Count > 0 && Operands[0] != null)
            {
                Value.Copy(Operands[0], val);
            }
            return true;
        }
    }
}
