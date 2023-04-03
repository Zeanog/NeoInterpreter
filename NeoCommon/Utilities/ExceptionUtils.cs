using System;

namespace Neo.Utilities {
    public class ExceptionUtils {
        public static void  Throw<TException>( bool exp ) where TException : Exception, new() {
            Throw<TException>( exp, "" );
        }

        public static void  Throw<TException>( bool exp, string extraMsg ) where TException : Exception, new() {
            if( exp ) {
                return;
            }

            throw (Exception)Activator.CreateInstance( typeof(TException), extraMsg );
        }
    }
}
