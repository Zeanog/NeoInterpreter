using System;
using System.IO;
using System.Runtime.Serialization;

namespace Neo {
    [Serializable]
    public class MultiplyInstruction : MultiTypeInstruction {
        public MultiplyInstruction( Value lhs, Value rhs, Value ret ) : base( lhs, rhs, ret ) {
            BuildHandlers();
        }

        public MultiplyInstruction( SerializationInfo info, StreamingContext context ) : base( info, context ) {
            BuildHandlers();
        }

        protected void  BuildHandlers() {
             AddTypeCompare( typeof(int), typeof(int), 
                delegate(CPU cpu) {
                    Operands[2].Set( Operands[0].Get<int>() * Operands[1].Get<int>() );
                }
            );

            AddTypeCompare( typeof(float), typeof(float),
                delegate(CPU cpu) {
                    Operands[2].Set( Operands[0].Get<float>() * Operands[1].Get<float>() );
                }
            );
        }
    }
}
