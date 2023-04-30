using System;
using System.Collections.Generic;
using System.IO;
using System.Runtime.Serialization;

namespace Neo {
    public abstract class MultiTypeInstruction : Instruction {
        protected Dictionary<Type, Dictionary<Type, Action<CPU>>> TypeCompareMap = new Dictionary<Type,Dictionary<Type,Action<CPU>>>();

        public MultiTypeInstruction( params Value[] args ) : base( args ) {
        }

        public MultiTypeInstruction( SerializationInfo info, StreamingContext context ) : base( info, context ) {
        }

        protected void  AddTypeCompare( Type lhs, Type rhs, Action<CPU> handler ) {
            Dictionary<Type, Action<CPU>> map = null;

            if(!TypeCompareMap.ContainsKey(lhs)) {
				map = new Dictionary<Type,Action<CPU>>();
				TypeCompareMap.Add( lhs, map );
			} else {
                map = TypeCompareMap[lhs];
			}

            map[ rhs ] = handler;
        }

        public override bool    Execute( CPU cpu ) {
            Type lhs = Operands[0].ValueType;
            Type rhs = Operands[1].ValueType;
            Action<CPU> handler = TypeCompareMap[lhs][rhs];
            handler( cpu );
            return true;
        }
    }
}
