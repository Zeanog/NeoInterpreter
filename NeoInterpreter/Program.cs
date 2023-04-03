using System;
using Neo;
using System.IO;
using System.Runtime.Serialization;
using System.Runtime.Serialization.Formatters.Binary;

namespace NeoInterpreter
{
    class Program
    {
        static void Main(string[] args)
        {   
            try
            {
                Stream stream = File.Open("../NeoCompiler/Test.neo", FileMode.Open);
                BinaryFormatter bformatter = new BinaryFormatter();

                Console.WriteLine("Reading .neo file...");

                bformatter.Deserialize(stream);
                stream.Close();
            }
            catch (Exception)
            {
                int d = 3;
            }

            CPU.Instance.Initialize();

            CPU.Instance.ExecuteCycles();
        }
    }
}
