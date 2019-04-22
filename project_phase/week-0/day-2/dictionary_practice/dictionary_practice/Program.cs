using System;
using System.Collections.Generic;
using System.Linq;

namespace dictionary_practice
{
    class Program
    {
        static void Main(string[] args)
        {
            Dictionary<int, string> map = new Dictionary<int, string>
            {
                [0] = "a",
                [324]= "b"
            };

            List<int> keyList = map.Keys.ToList();
            keyList.ForEach(i => Console.Write($"Number: {i} ", i));

            string name = "Mo        lnár            Lász        ló";

            Console.WriteLine(name.Replace(" ", ""));
            Console.Read();
        }
    }
}
