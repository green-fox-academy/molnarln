using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Animal
{
    class Animal
    {
        public int hunger { get; set; }
        private int thirst;
        
        public Animal()
        {
            this.hunger = 50;
            this.thirst = 50;
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

        public int GetThirst()
        {
            return this.thirst;
        }

        public void SetThirst(int thirst)
        {
            this.thirst = thirst;
        }

    }
}
