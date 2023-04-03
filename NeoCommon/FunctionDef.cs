using System;
using System.Collections.Generic;

namespace Neo {
    public class FunctionDef {
        protected FunctionDef Previous;

        public string Name;
        public List<Instruction> InstructionStream = new List<Instruction>();
        public int NumParameters;
        public int StackFrameSize;
        public int StartAddress
        {
            get
            {
                if (Previous == null)
                {
                    return 0;
                }
                return Previous.EndAddress;
            }
        }

        public int EndAddress {
            get {
                return StartAddress + InstructionStream.Count;
            }
        }

        public FunctionDef(string name, FunctionDef prev)
        {
            Name = name;
            Previous = prev;
        }

        public void PreBodyParse()
        {
        }

        public void PostBodyParse()
        {
            Value retAddress = CPU.Instance.Registers[0];

            InstructionStream.Add(new PopInstruction(retAddress));
            InstructionStream.Add(new JumpInstruction(retAddress));
        }
    }
}