using System;
using System.Collections.Generic;

namespace dictionary_practice
{
    class Program
    {
        static void Main(string[] args)
        {
            Dictionary<int, string> map = new Dictionary<int, string>
            {
                [0] = "a"
            };

            Console.WriteLine(map[0]);


            string name = "Mo        lnár            Lász        ló";

            Console.WriteLine(name.Replace(" ", ""));
            Console.Read();
        }
    }
}
