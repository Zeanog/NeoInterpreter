using System;
using System.Collections.Generic;
using Neo;
using Antlr;
using Antlr.Runtime;
using Antlr.Runtime.Tree;
using System.IO;
using System.Runtime.Serialization;
using System.Runtime.Serialization.Formatters.Binary;

namespace NeoCompiler {
    class Program {
        protected static List<Type> m_PrePassTypes = new List<Type>();
        protected static List<Type> m_PassTypes = new List<Type>();

        static void Main(string[] args) {
            string srcFileName = args[0];
            string exeFileName = srcFileName.Replace(Path.GetExtension(srcFileName), ".neo");

            CPU.Instance.Initialize();

            //m_PrePassTypes.Add(typeof(NeoPreTreePass1));
            m_PassTypes.Add(typeof(NeoTreePass1));
            m_PassTypes.Add(typeof(NeoTreePass2));

            try
            {
                ANTLRFileStream Input = new ANTLRFileStream(args[0]);
                //ANTLRStringStream Input = new ANTLRStringStream("int i;i=3+5*2;");
                NeoLexer Lexer = new NeoLexer(Input);
                CommonTokenStream Tokens = new CommonTokenStream(Lexer);
                NeoParser Parser = new NeoParser(Tokens);

                AstParserRuleReturnScope<CommonTree, CommonToken> ParseReturn = Parser.Process();

                CommonTree Tree = ParseReturn.Tree;
                CommonTreeNodeStream nodes = new CommonTreeNodeStream(Tree);
                nodes.TokenStream = Tokens;

                System.Object[] parms = new Object[1] { nodes };
                Antlr.Runtime.Tree.TreeParser treeParser = null;
                AstTreeRuleReturnScope<CommonTree, CommonTree> prePassReturn = null;

                //foreach (Type type in m_PrePassTypes) {
                //    treeParser = Activator.CreateInstance(type, parms) as Antlr.Runtime.Tree.TreeParser;
                //    prePassReturn = type.InvokeMember("Process", System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public | System.Reflection.BindingFlags.InvokeMethod, null, treeParser, null) as AstTreeRuleReturnScope<CommonTree, CommonTree>;
                //}

                foreach( Type type in m_PassTypes ) {
                    treeParser = Activator.CreateInstance(type, parms) as Antlr.Runtime.Tree.TreeParser;
                    type.InvokeMember("Process", System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public | System.Reflection.BindingFlags.InvokeMethod, null, treeParser, null);

                    nodes.Reset();
                }

                //NeoTreePass1 tree1 = new NeoTreePass1( nodes );
                //tree1.Process();

                //nodes.Reset();

                //NeoTreePass2 tree2 = new NeoTreePass2( nodes );
                //tree2.Process();

                CPU.Instance.FunctionCodeBase = CPU.Instance.InstructionStream.Count;
                ProgramDef.Instance.FunctionDefs.AppendToStream(CPU.Instance.InstructionStream);

                Stream stream = File.Open(exeFileName, FileMode.Create);
                BinaryFormatter bformatter = new BinaryFormatter();
            
                Console.WriteLine("Writing .neo file...");
                bformatter.Serialize(stream, CPU.Instance);
                stream.Close();
            }
            catch( System.Exception ex ) {
                Console.Write( ex.ToString() );
            }

            Console.Write( "Press any key to quit..." );
            while (Console.ReadKey(false) == null) { }
        }
    }
}
