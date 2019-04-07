using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Pirates
{
    class Ship
    {
        public List<Pirate> Pirates { get; private set; }
        public bool HasCaptain { get; set; }

        public Ship()
        {
            this.Pirates = new List<Pirate>();
            this.HasCaptain = false;
        }


        public void FillShip(Pirate pirate)
        {
            if (this.HasCaptain && pirate.IsCaptain)
            {
                Console.WriteLine("The ship has already a captain!");
            }
            if (pirate.IsCaptain && !this.HasCaptain)
            {
                this.HasCaptain = true;
                this.Pirates.Add(pirate);
            }
            else
            {
                this.Pirates.Add(pirate);
            }
        }

        public override string ToString()
        {
            List<string> listOfStrings = new List<string>();
            Pirates.ForEach(i => listOfStrings.Add(i.IsCaptain.ToString()));

            //---------------using delegate instead of lambda expression:---------------------------//


            //return listOfStrings.Aggregate((a, b) => a + ", " + b);

            // return listOfStrings.Aggregate(delegate (string x, string b)
            //{
            //    return x + ", " + b;
            //}
            // );

            Func<string, string, string> a = delegate (string x, string y)
            {
                return x + ", " + y;
            };

            return listOfStrings.Aggregate(a);


        }
    }
}
