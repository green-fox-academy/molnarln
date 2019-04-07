using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace delegate_practice
{
    class Program
    {
        private delegate void Show(string s);


        // Create a method for a delegate.
        public static void MyDelegateMethod(string message)
        {
            System.Console.WriteLine(message);
        }
    
        private delegate void AddNumbers(int a, int b);

        public static void AddingMethod (int a, int b)
        {
            Console.WriteLine(a+b);
        }
        static void Main(string[] args)
        {
            Show p = MyDelegateMethod;
            p("My Delegate");
            p.Invoke("My Delegate");

            //------------------------------//

            AddNumbers add = AddingMethod;
            add(3,4);

            System.Console.ReadLine();
        }
    }
}
