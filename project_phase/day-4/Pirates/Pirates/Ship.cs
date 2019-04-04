using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Pirates
{
    class Ship
    {
        private List<Pirate> pirates;
        public List<Pirate> Pirates { get => pirates; private set => pirates = value; }

        private bool hasCaptain;
        public bool HasCaptain { get => hasCaptain; set => hasCaptain = value; }

        public Ship()
        {
            this.pirates = new List<Pirate>();
            this.hasCaptain = false;
        }


        public void FillShip(Pirate pirate)
        {
            if (this.hasCaptain && pirate.IsCaptain)
            {
                Console.WriteLine("The ship has already a captain!");
            }
            if (pirate.IsCaptain && !this.hasCaptain)
            {
                this.hasCaptain = true;
                this.pirates.Add(pirate);
            }
            else
            {
                this.pirates.Add(pirate);
            }
        }

        public override string ToString()
        {
            List<string> listOfStrings = new List<string>();
            pirates.ForEach(i => listOfStrings.Add(i.IsCaptain.ToString()));
            return listOfStrings.Aggregate((a, b) => a + ", " + b);
        }
    }
}
