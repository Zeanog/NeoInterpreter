using System;
using System.IO;
using System.Runtime.Serialization;

namespace Neo
{
    [Serializable]
    public class CallInstruction : JumpInstruction {
        public CallInstruction(Value offset)
            : base(offset)
        {
        }

        public CallInstruction(FunctionDef funcDef)
            : base(new LiteralValue(funcDef.StartAddress))
        {
        }

        public CallInstruction(SerializationInfo info, StreamingContext context) : base(info, context) {
            
        }

        public override bool    Execute( CPU cpu ) {
            cpu.CurrentInstructionIndex = cpu.FunctionCodeBase + Operands[0].Get<Int32>();
            return true;
        }
    }
}
