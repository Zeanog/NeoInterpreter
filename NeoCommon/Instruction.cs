using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Runtime.Serialization;

namespace Neo {
    [Serializable]
    public abstract class Instruction : ISerializable {
        protected List<Value>     Operands = new List<Value>();

        public Instruction( params Value[] args ) {
            if( args == null ) {
                return;
            }

            foreach( Value arg in args ) {
                Operands.Add( arg );
            }
        }

        public Instruction( SerializationInfo info, StreamingContext context ) {
            Operands = (List<Value>)info.GetValue( "Operands", typeof(List<Value>) );
        }

        public void GetObjectData( SerializationInfo info, StreamingContext context ) {
            info.AddValue( "Operands", Operands );
        }

        public abstract bool    Execute( CPU cpu );
    }
}