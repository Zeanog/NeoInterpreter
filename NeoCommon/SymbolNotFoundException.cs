using System;

namespace Neo
{
    public class SymbolNotFoundException : Exception {
        public SymbolNotFoundException() {
        }

        public SymbolNotFoundException(string msg)
            : base(msg)
        {
        }
    }
}
