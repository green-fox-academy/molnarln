using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace string_practice
{
    class Program
    {
        static void Main(string[] args)
        {
            ReverseString("sfdsa");
            Console.ReadKey();

        }

        public static string ReverseString(string original)
        {
            List<int> intList = new List<int> { 43, 45, 3, 543, 53, 5, 435, 3, 53, 5, 4 };

            intList.ForEach(i => Console.Write(i + " "));
            Console.WriteLine();

            intList.ForEach(i => Console.WriteLine(i + 1000 + " "));

            return new string(original.Reverse().ToArray());
        }
    }
}
