using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace linq_practice
{
    class Program
    {
        static void Main(string[] args)
        {
            //Write a LINQ Expression to get the even numbers from the following array:

            int[] n = { 1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14 };

            var a = n.Where(i => i % 2 == 0);
            var b = from c in n
                    where c % 2 == 0
                    select c;

            foreach (var i in b)
            {
                Console.WriteLine(i);
            }
            //-------------------------------------------------------------------------------------------------

            //Write a LINQ Expression to get the average value of the odd numbers from the following array:

            int[] n2 = { 1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14 };

            var a2 = n.Where(i => i % 2 != 0).Average();
            var b2 = from i in n2
                     where i % 2 != 0
                     select i;

            Console.WriteLine("Average: " + b2.Average());

            //-------------------------------------------------------------------------------------------------
            // Write a LINQ Expression to find the frequency of numbers in the following array:

            int[] n3 = new int[] { 5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2 };

            var a3 = n3.GroupBy(i => i).Select(group => new { number = group.Key, count = group.Count() });
            var a4 = n3.GroupBy(i => i);

            foreach (var item in a4)
            {
                foreach (var i in item)
                {
                    Console.WriteLine(i);
                }
            }

            foreach (var num in a3)
            {
                Console.WriteLine("Number: {0}, Frequency: {1}", num.number, num.count);
            }

            Dictionary<int, int> dic = new Dictionary<int, int>();
            foreach (var item in a3)
            {
                dic[item.number] = item.count;
            }



            //------------------------------------------------------------------------------------------------
            //Write a LINQ Expression to find the strings which starts with A and ends with I in the following array:
            string[] cities = { "ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS" };

            var citiesQ = cities.Where(c => c.First() == 'A' && c.Last() == 'I');
            foreach (var item in citiesQ)
            {
                Console.WriteLine(item);
            }
            //------------------------------------------------------------------------------------------------
            // Write a LINQ Expression to convert a char array to a string.
            char[] charArray = { 'a', 'p', 'p', 'l', 'e' };
            string[] stringArray = new string[charArray.Length];

            for (int i = 0; i < charArray.Length; i++)
            {
                stringArray[i] = charArray[i].ToString();
            }
            string stringFromArray = stringArray.Aggregate((chara, charb) => chara + charb);
            Console.WriteLine(stringFromArray);

            char elso = 'a';
            char masodik = 'b';
            string osszes = elso.ToString() + masodik.ToString();
            Console.WriteLine(osszes);

                    
                


            Console.Read();
        }
    }
}
