using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;

namespace file_io_practice
{
    class Program
    {
        static void Main(string[] args)
        {
            //string stringtowritetofile = Console.ReadLine();
            string fileName = @"C:\Users\laszl\Documents\Programozás\greenfox\projectphase\week-0\day-3\file_io_practice\file_io_practice\test.txt";
            //try
            //{
            //File.AppendAllText(fileName, stringToWriteToFile);
            //}catch(Exception fileIOException)
            //{
            //    Console.WriteLine("File not found!!");
            //}

            //string stringFromFile = File.ReadAllText(fileName);
            //Console.WriteLine(stringFromFile);
            //Console.Read();

            //using(StreamReader reader = new StreamReader(fileName))
            //{
            //    Console.WriteLine(reader.ReadToEnd());
            //}

            using (StreamWriter writer = new StreamWriter(fileName, true))
            {
                writer.WriteLine("some new thing to write \n");
            }

            Console.Read();

        }
    }
}
