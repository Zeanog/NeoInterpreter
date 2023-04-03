using System;
using System.IO;
using System.Runtime.Serialization;

namespace Neo {
    [Serializable]
    public class PushInstruction : Instruction {
        public PushInstruction( Value val ) : base( val ) {
            
        }

        public PushInstruction( SerializationInfo info, StreamingContext context ) : base( info, context ) {

        }

        public override bool    Execute( CPU cpu ) {
            cpu.PushOntoStack( Operands[0] );
            return true;
        }
    }
}
