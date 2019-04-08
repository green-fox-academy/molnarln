using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Valami;

namespace MyProgram
{


    class Program
    {

        static void Main(string[] args)
        {
            Animal animal1 = new Animal();

            animal1.Play();
            animal1.Play();
            animal1.Play();
            Console.WriteLine($"The hunger of the animal is: {animal1.Hunger} \n " +
                $"and the thirst of the animal is {animal1.Thirst}");

            Animal cat1 = new Cat();

            Console.WriteLine(cat1.Hunger);
            Console.WriteLine(cat1.Thirst);

            Cat cat2 = new Cat(20);
            //Create an empty name, to see if the Name getter works well:
            cat2.Name = string.Empty;
            Console.WriteLine(cat2.Thirst);
            Console.WriteLine($"The name of the cat: {cat2.Name}");
            Cat cat3 = new Cat();
            Console.WriteLine($"The number of animals: {cat2.NumberOfAnimals}");

            Cat cat10 = new Cat(1);
            Cat cat20 = new Cat(4);
            Cat cat30 = new Cat(7);
            Cat cat40 = new Cat(9);
            Cat cat50 = new Cat(34);
            Cat cat60 = new Cat(4543);
            List<Cat> catList = new List<Cat> { cat10, cat20, cat30, cat40, cat50, cat60 };
            List<Cat> catList2 = new List<Cat>(catList) { cat10, cat20, cat30, cat40, cat50, cat60 };
            catList.Sort();

            List<Cat> catList3 = new List<Cat>() {
                new Cat(4),
                new Cat(5)
            };

            catList2.ForEach(i => Console.WriteLine(i.Hunger));

            Random rnd = new Random();
            int random1 = rnd.Next(0, 1000);
            int random2 = rnd.Next(0, 1000);
            Console.WriteLine(random1 + ", " + random2);

            Console.Read();
        }
    }
}
