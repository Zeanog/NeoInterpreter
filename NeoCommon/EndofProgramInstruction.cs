using System;
using System.IO;
using System.Runtime.Serialization;

namespace Neo
{
    [Serializable]
    public class EndofProgramInstruction : Instruction {
        public EndofProgramInstruction() : base() {
        }

        public EndofProgramInstruction(SerializationInfo info, StreamingContext context)
            : base(info, context)
        {
            
        }

        public override bool    Execute( CPU cpu ) {
            return false;
        }
    }
}
