using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.InteropServices;

namespace ArrayPractice
{
    class Program
    {
        static void Main(string[] args)
        {

            //int[] aj = new int[5] { 1, 2, 3, 4, 5 };
            //int[] valami = new int[5];
            //Array.Reverse(aj);
            //Console.WriteLine("Please write your name!");
            //Console.WriteLine(string.Join(",", aj));

            //string name = Console.ReadLine();
            //for (int i = 0; i < name.Length; i++)
            //{
            //    Console.WriteLine(name[i]);
            //}

            //Console.Read();

            List<int> spendings = new List<int> { 500, 1000, 1250, 175, 800, 120 };
            int sum = 0;

            foreach (var item in spendings)
            {
                sum += item;
            }
            Console.WriteLine("Our spending is: " + sum);

            int max = 0;

            foreach (var item in spendings)
            {
                if (item > max)
                {
                    max = item;
                }
            }

            Console.WriteLine("The maximum spending is : " + max);
           

            int min = max;

            foreach (var item in spendings)
            {
                if (min > item)
                {
                    min = item;
                }
            }
            Console.WriteLine("The minimum spending was: " + min);
            Console.Read();


        }
    }
}
