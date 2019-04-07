using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace groupby_practice
{
    class Program
    {
        static void Main(string[] args)
        {

            List<Person> persons = new List<Person>();
            persons.Add(new Person { PersonID = 1, car = "Ferrari" });
            persons.Add(new Person { PersonID = 1, car = "BMW" });
            persons.Add(new Person { PersonID = 2, car = "Audi" });

            var result = Enumerable.GroupBy(persons, i => i.PersonID, i => i.car, (key, cars) => new { PersonId = key, cars = cars.ToList() });

            List<string> autosOfId1 = new List<string>();

            foreach (var item in result)
            {
                if (item.PersonId == 1)
                {
                    autosOfId1 = item.cars;
                }
            }

            //autosOfId1.ForEach(i => Console.WriteLine(i));

            List<Person> persons2 = new List<Person>();
            persons2.Add(new Person { PersonID = 1, car = "Ferrari" });
            persons2.Add(new Person { PersonID = 1, car = "BMW" });
            persons2.Add(new Person { PersonID = 2, car = "Audi" });

            var result2 = persons2.GroupBy(i => i.PersonID, i => i.car, (key, cars) => new { PresonId = key, CarAmount = cars.Count() });

            foreach (var item in result2)
            {
                Console.WriteLine("PersonId: " + item.PresonId + " cars amount: " + item.CarAmount);
            }


            var result3 = persons2.GroupBy(i => i.PersonID, i => i.car).Select(i => new { PersonId = i.Key, cars = i.ToList() });
            foreach (var item in result3)
            {
                Console.WriteLine(item.PersonId + "'s cars are: " + string.Join(", ", item.cars));
            }


            // Write a LINQ Expression to find the frequency of numbers in the following array:

            int[] n3 = new int[] { 5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2 };

            var resultN3 = n3.GroupBy(item => item, (k, f) => new { key = k, frequency = f.Count() });

            foreach (var item in resultN3)
            {
                Console.WriteLine("Number: " + item.key + " frequency: " + item.frequency);
            }

            var resultN4 = n3.GroupBy(i => i, (k, e) => new { number = k, frequency = e.Count() });

            foreach (var item in resultN4)
            {
                Console.WriteLine($"A {item.number}-s szám gyakorisága : {item.frequency}");
            }

            List<string> words = new List<string>() { "an", "apple", "a", "day" };

            var firstChar = words.Select(i => i.Substring(0, 1));

            foreach (var item in firstChar)
            {
                Console.WriteLine(item);
            }

            List<string> firstChar2 = new List<string>();

            words.ForEach(i => firstChar2.Add(i.Substring(0, 1)));
            firstChar2.ForEach(i => Console.WriteLine(i));

            string testString = "masodik teszt négy szó";
            Console.WriteLine("Word count: " + MyExtensions.WordCount("elso teszt"));
            Console.WriteLine("Word count: " + testString.WordCount());



            Console.Read();

        }
    }
}
