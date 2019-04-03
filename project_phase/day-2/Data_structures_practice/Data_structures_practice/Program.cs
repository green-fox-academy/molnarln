using System;
using System.Collections.Generic;

namespace Data_structures_practice
{
    class Program
    {

        static void Main(string[] args)
        {
            string[] stringArray = new string[] { "Elso", "Masodik", "Harmadik" };

            for (int i = 0; i < stringArray.Length; i++)
            {
                Console.WriteLine(stringArray[i]);
            }

            Console.ReadKey();

            List<int> numberList = new List<int> { 1, 2, 3, 4, 5 };
            List<string> stringList = new List<string>();

            foreach (int number in numberList)
            {
                stringList.Add(Convert.ToString(number));
            }

            foreach (string item in stringList)
            {
                Console.WriteLine(item);
            }
            Console.WriteLine("--------------------------------");

            stringList.Remove("1");

            foreach (string item in stringList)
            {
                Console.WriteLine(item);
            }
            string elementToRemove = "2";

            Console.WriteLine("--------------------------------");
            stringList.Remove(elementToRemove.ToLower());
            Console.WriteLine("Please add a string!");

            DoSomething("a");


            Console.ReadLine();
        }


        public static void DoSomething(string name)
        {
            List<int> intList = new List<int> { 1, 2, 3, 4, 5 };

            string fromtListToString = string.Join(",", intList);
            

            foreach (int item in intList)
            {
                Console.WriteLine(fromtListToString);
            }
        }
    }
}

