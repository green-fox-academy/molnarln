using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Pirates
{
    class Program
    {
        static void Main(string[] args)
        {

            Pirate pirate1 = new Pirate();
            Pirate pirate2 = new Pirate();
            Pirate pirate3 = new Pirate("vilmos", true);

            Ship ship = new Ship();
            ship.FillShip(pirate1);
            ship.FillShip(pirate2);
            ship.FillShip(pirate3);

            Console.WriteLine(ship.ToString());


            Console.ReadKey();

        }
    }
}
