using System;
using System.IO;
using System.Runtime.Serialization;

namespace Neo {
    [Serializable]
    public class JumpInstruction : Instruction {
        public JumpInstruction( Value offset ) : base( offset ) {
        }

        public JumpInstruction( SerializationInfo info, StreamingContext context ) : base( info, context ) {
            
        }

        public override bool    Execute( CPU cpu ) {
            cpu.CurrentInstructionIndex = Operands[0].Get<int>();
            return true;
        }
    }
}
