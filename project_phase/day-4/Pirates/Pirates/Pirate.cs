using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Pirates
{
    class Pirate
    {
        public string Name { get; set; }
        public int LevelOfIntoxication { get; set; }
        public bool IsSleeping { get; set; }
        public bool IsDead { get; set; }
        public bool IsCaptain { get; set; }

        public Pirate()
        {
            this.IsCaptain = false;
            this.IsSleeping = false;
            this.IsDead = false;
            this.LevelOfIntoxication = 0;
        }

        public T DoSomething<T>(dynamic input, dynamic input2)
        {
            return input + input2;
        }

        public Pirate(string name, bool isCaptain)
        {
            this.IsSleeping = false;
            this.IsDead = false;
            this.LevelOfIntoxication = 0;
            this.Name = name;
            this.IsCaptain = isCaptain;
        }

        public void DrinkSomeRum()
        {
            if (IsDead)
            {
                Console.WriteLine("he is dead");
            }
            else
            {
                this.LevelOfIntoxication++;
            }
        }

        public void HowItIsGoingMate()
        {
            if (IsDead)
            {
                Console.WriteLine("he is dead");
            }
            else
            {
                if (this.LevelOfIntoxication <= 4)
                {
                    Console.WriteLine("Pour me anudder!");
                }
                else
                {
                    Console.WriteLine($"Arghh, I'm Pirate. How d'ya d'ink its goin?");
                }
            }
        }

        public void Die()
        {
            this.IsDead = true;
        }

        public void Brawl(Pirate pirate)
        {
            if (this.IsDead)
            {
                Console.WriteLine("he is dead");
            }
            else
            {
                if (!pirate.IsDead)
                {
                    Random rnd = new Random();
                    int random = rnd.Next(1, 3);
                    if (random == 1)
                    {
                        this.IsDead = true;
                    }
                    if (random == 2)
                    {
                        pirate.IsDead = true;
                    }
                    if (random == 3)
                    {
                        this.IsSleeping = true;
                        pirate.IsSleeping = true;
                    }
                }
            }
        }
    }
}
