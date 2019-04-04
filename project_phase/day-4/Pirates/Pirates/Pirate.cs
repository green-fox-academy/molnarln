using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Pirates
{
    class Pirate
    {
        private string name;
        public string Name { get => name; set => name = value; }

        private int levelOfIntoxication;
        public int LevelOfIntoxication { get => levelOfIntoxication; set => levelOfIntoxication = value; }

        private bool isSleeping;
        public bool IsSleeping { get => isSleeping; set => isSleeping = value; }

        private bool isDead;
        public bool IsDead { get => isDead; set => isDead = value; }


        public Pirate()
        {
            this.isSleeping = false;
            this.isDead = false;
            this.LevelOfIntoxication = 0;
        }

        public Pirate(string name)
        {
            this.isSleeping = false;
            this.isDead = false;
            this.LevelOfIntoxication = 0;
            this.name = name;
        }

        public void DrinkSomeRum()
        {
            if (isDead)
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
            if (isDead)
            {
                Console.WriteLine("he is dead");
            }
            else
            {
                if (this.levelOfIntoxication <= 4)
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
            this.isDead = true;
        }

        public void Brawl(Pirate pirate)
        {
            if (this.isDead)
            {
                Console.WriteLine("he is dead");
            }
            else
            {
                if (!pirate.isDead)
                {
                    Random rnd = new Random();
                    int random = rnd.Next(1, 3);
                    if (random == 1)
                    {
                        this.isDead = true;
                    }
                    if (random == 2)
                    {
                        pirate.isDead = true;
                    }
                    if (random == 3)
                    {
                        this.isSleeping = true;
                        pirate.isSleeping = true;
                    }
                }
            }
        }
    }
}
