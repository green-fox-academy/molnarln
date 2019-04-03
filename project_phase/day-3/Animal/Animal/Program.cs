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
            Console.WriteLine(cat2.Thirst);
            Console.WriteLine(cat2.Name);


            Console.Read();
        }
    }
}
