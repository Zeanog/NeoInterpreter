using System;
using System.IO;
using System.Runtime.Serialization;

namespace Neo {
    [Serializable]
    public class CopyInstruction : MultiTypeInstruction {
        public CopyInstruction( Value dst, Value src ) : base( dst, src ) {
            BuildHandlers();
        }

        public CopyInstruction( SerializationInfo info, StreamingContext context ) : base( info, context ) {
            BuildHandlers();
        }

        public override bool    Execute( CPU cpu ) {
            Type lhs = Operands[1].ValueType;
            Type rhs = Operands[1].ValueType;
            Action<CPU> handler = TypeCompareMap[lhs][rhs];
            handler( cpu );
            return true;
        }

        protected void  BuildHandlers() {
            AddTypeCompare( typeof(int), typeof(int), delegate(CPU cpu) {
                    Operands[0].Set( Operands[1].Get<int>() );
                }
            );

            AddTypeCompare( typeof(float), typeof(float), delegate(CPU cpu) {
                    Operands[0].Set( Operands[1].Get<float>() );
                }
            );
        }
    }
}
