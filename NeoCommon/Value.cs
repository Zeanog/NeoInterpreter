﻿using System;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using System.Reflection;
using Neo.Utilities;

namespace Neo {
    [Serializable]
    public abstract class Value : ISerializable {
        public readonly static Value IntZero = new LiteralValue( 0 );
        public readonly static Value FloatZero = new LiteralValue( 0.0f );
        public readonly static Value Uninitialized = new LiteralValue();

	    public abstract Type 		ValueType {
		    get;
	    }

        public abstract object      Get();
        public abstract void        Set( object val );
		
		public abstract T			Get<T>();
		
		public abstract void		Set<T>( T val, int index );
		public void					Set<T>( T val ) {
			Set( val, -1 );
		}

        public abstract void GetObjectData( SerializationInfo info, StreamingContext context );
        public abstract bool    IsValid {
            get;
        }

        public static void  Copy( Value dst, Value src ) {
            if( !src.IsValid ) {
                return;
            }
			
			if( !dst.ValueType.IsAssignableFrom(src.ValueType) ) {
				throw new Exception("PushInstruction.Execute - InvalidType");
			}
			
			dst.Set( src.Get() );
        }
    }

    [Serializable]
    public class LiteralValue : Value {
	    protected object	        m_Value;

	    public override Type 		ValueType {
		    get {
                if (m_Value == null)
                {
                    return null;
                }
                return m_Value.GetType();
		    }
	    }

        public override object Get() {
            return m_Value;
        }

        public override void Set( object val ) {
            m_Value = val == null ? null : Activator.CreateInstance( val.GetType() );
        }

        public LiteralValue() {
        }

        public LiteralValue( object val ) {
            m_Value = val;
        }

        public LiteralValue( SerializationInfo info, StreamingContext context ) {
            m_Value = info.GetValue( "Value", typeof(object) );
        }

        public override void GetObjectData( SerializationInfo info, StreamingContext context ) {
            info.AddValue("Value", m_Value);
        }
		
		public override T		Get<T>() {
			return (T)m_Value;
		}
		
		public override void		Set<T>( T val, int index ) {
			if( ValueType.IsArray && index >= 0 ) {
				T[] arr = (T[])m_Value;
				arr[index] = val;
				return;
			}

			if( ValueType.IsAssignableFrom(typeof(IList<T>)) && index >= 0 ) {
				IList<T> list = (IList<T>)m_Value;
				list[index] = val;
				return;
			}
			
			if( ValueType.IsAssignableFrom(typeof(IList)) && index >= 0 ) {
				IList list = (IList)m_Value;
				list[index] = val;
				return;
			}
			
			ExceptionUtils.Throw<Exception>( ValueType == typeof(T) );
			m_Value = val;
		}
	
        public override bool    	IsValid {
            get {
                return m_Value != null;
            }
        }
    }

    [Serializable]
    public class MemoryValue : Value {
        protected Type                  m_ValueType;
        protected int				    m_Offset = -1;
	
        protected virtual LiteralValue  m_Value {
            get {
                return CPU.Instance.Heap[ m_Offset ];
            }
        }

	    public override Type 		ValueType {
		    get {
                if( m_Offset >= 0 ) {
                    ExceptionUtils.Throw<Exception>(m_ValueType == m_Value.ValueType);
                }
                ExceptionUtils.Throw<Exception>(m_ValueType != null);
			    return m_ValueType;
		    }
	    }

        public override object Get()
        {
            return m_Value.Get();
        }

        public override void Set( object val )
        {
            m_Value.Set( val );
        }

        public MemoryValue() {
        }

        public MemoryValue( Type t, int offset ) : this() {
            m_ValueType = t;
            m_Offset = offset;
        }

        public MemoryValue( SerializationInfo info, StreamingContext context ) {
            m_ValueType = (Type)info.GetValue( "ValueType", typeof(Type) );
            m_Offset = (int)info.GetValue( "Offset", typeof(int) );
        }

        public override void GetObjectData( SerializationInfo info, StreamingContext context ) {
            info.AddValue( "ValueType", m_ValueType );
            info.AddValue( "Offset", m_Offset );
        }

	    public override T		Get<T>() {
			return m_Value.Get<T>();
		}
		
		public override void		Set<T>( T val, int index ) {
			m_Value.Set( val, index );
		}

        public override bool    IsValid {
            get {
                return m_Offset >= 0 && m_Value.IsValid;
            }
        }
    }

    [Serializable]
    public class StackValue : MemoryValue {
        protected override LiteralValue m_Value
        {
            get {
                return CPU.Instance.CurrentStackFrame[m_Offset];
            }
        }

        public override Type ValueType
        {
            get
            {
                ExceptionUtils.Throw<Exception>(m_ValueType != null);
                return m_ValueType;
            }
        }

        public StackValue() {
        }

        public StackValue( Type t, int offset ) : base( t, offset ) {
        }

        public StackValue( SerializationInfo info, StreamingContext context ) : base( info, context ) {
        }
    }

    [Serializable]
    public class RegisterValue : MemoryValue {
        protected override LiteralValue      m_Value {
            get {
                return CPU.Instance.Registers[ m_Offset ];
            }
        }

        public RegisterValue() {
        }

        public RegisterValue( Type t, int offset ) : base( t, offset ) {
        }

        public RegisterValue( SerializationInfo info, StreamingContext context ) : base( info, context ) {
        }
    }
}