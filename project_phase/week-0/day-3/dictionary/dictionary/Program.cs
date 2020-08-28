using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace dictionary
{
    class Program
    {
        static void Main(string[] args)
        {
            Dictionary<string, int> products = new Dictionary<string, int>
            {
                ["Eggs"] = 200,
                ["Milk"] = 200,
                ["Fish"] = 400,
                ["Apples"] = 150,
                ["Bread"] = 50,
                ["Chicken"] = 125
            };
            products.Add("Something", 600);
            string productToSearch = "Fish";
            List<string> keys;
            keys = products.Keys.ToList();

            int priceOfFish = products[productToSearch];

            Console.WriteLine("The price of the " + productToSearch + " : " + priceOfFish);

            string mostExpensiveProduct = string.Empty;
            int mostExpensivePrice = products.Values.Max();
            foreach (var key in keys)
            {
                if (mostExpensivePrice == products[key])
                {
                    mostExpensiveProduct = key;
                }
            }
            Console.WriteLine("The most expensive product is: " + mostExpensiveProduct);

            Console.WriteLine("The average price is: " + products.Values.Average());
            Console.WriteLine("The number of items cheaper than 300: " + products.Values.Where(i => i < 300).Count());

            if (products.Values.Where(i => i == 125).Count() > 0)
            {
                Console.WriteLine("There is " + products.Values.Where(i => i == 125).Count() + " item for 125.");
            }
            else
            {
                Console.WriteLine("There is nothing to buy for 125.");
            }


            //<<<----------------------Searching the cheapest value:------------------------------->>>

            //
            //int cheapestPrice = products.Values.Min();
            //string cheapestProduct = string.Empty;
            //foreach (var key in keys)
            //{
            //    if (cheapestPrice == products[key])
            //    {
            //        cheapestProduct = key;
            //    }
            //}

            string cheapestProduct = products.First(i => i.Value == products.Values.Min()).Key;
            Console.WriteLine("The cheapest product is: " + cheapestProduct);
            Console.ReadKey();
        }
    }
}
