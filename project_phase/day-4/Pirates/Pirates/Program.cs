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
            List<string> stringList = new List<string>();
            stringList.Add("marcsika");
            stringList.Add("marcsika");

            List<string> a = stringList.Where(x=>x.Length>5).ToList();
            a.ForEach(x => Console.WriteLine(x));


            Ship ship = new Ship();
            ship.FillShip(pirate1);
            ship.FillShip(pirate2);
            ship.FillShip(pirate3);

            Console.WriteLine(pirate1.DoSomething<int>(1, 2));

            Console.WriteLine(ship.ToString());

            Console.ReadKey();

        }
    }
}
