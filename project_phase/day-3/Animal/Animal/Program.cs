using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Animal
{
    class Program
    {
        static void Main(string[] args)
        {
            Animal animal1 = new Animal();

            animal1.Play();
            animal1.Play();
            animal1.Play();
            animal1.SetThirst(400);
            animal1.SetThirst(32312);


            Console.WriteLine(animal1.GetThirst());
            Console.Read();
        }
    }
}
