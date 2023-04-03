using System;
using System.IO;
using System.Runtime.Serialization;

namespace Neo {
    [Serializable]
    public class JumpEqualsInstruction : MultiTypeInstruction {
        public JumpEqualsInstruction( Value offset ) : base( offset ) {
            AddTypeCompare( typeof(int), typeof(int), delegate(CPU cpu) {
                    int lhs = Operands[0].Get<int>();
                    int rhs = Operands[1].Get<int>();

                    if( lhs != rhs ) {
                        return;
                    }

                    cpu.CurrentInstructionIndex += Operands[2].Get<int>();
                }
            );

            AddTypeCompare( typeof(float), typeof(float), delegate(CPU cpu) {
                    float lhs = Operands[0].Get<float>();
                    float rhs = Operands[1].Get<float>();

                    if( lhs != rhs ) {
                        return;
                    }

                    cpu.CurrentInstructionIndex = Operands[2].Get<int>();
                }
            );
        }
    }
}
