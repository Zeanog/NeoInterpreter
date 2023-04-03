using System;
using System.Collections.Generic;

namespace Neo {
    [Serializable]
     public class DivideInstruction : MultiTypeInstruction {
        public DivideInstruction( Value lhs, Value rhs, Value ret ) : base( lhs, rhs, ret ) {
            AddTypeCompare( typeof(int), typeof(int), delegate(CPU cpu) {
                    Operands[2].Set<int>(Operands[0].Get<int>() / Operands[1].Get<int>());
                }
            );

            AddTypeCompare( typeof(float), typeof(float), delegate(CPU cpu) {
                    Operands[2].Set<float>(Operands[0].Get<float>() / Operands[1].Get<float>());
                }
            );
        }
    }
}
