using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Valami
{
    class Animal 
    {
        private static int numberOfAnimals;
        public int NumberOfAnimals
        {
            get
            {
                return numberOfAnimals;
            }
        }

        private int hunger;
        private int thirst;

        public int Hunger
        {
            get { return this.hunger; }
        }

        public int Thirst
        {
            get { return this.thirst; }
            set { this.thirst = value; }
        }


        public Animal()
        {
            this.hunger = 50;
            this.thirst = 50;
            numberOfAnimals++;
        }

        public void Eat()
        {
            this.hunger--;
        }

        public void Drink()
        {
            this.thirst--;
        }

        public void Play()
        {
            this.hunger++;
            this.thirst++;
        }

        public abstract void SayHello()
        {
            Console.WriteLine("hello");
        }

    }
}
