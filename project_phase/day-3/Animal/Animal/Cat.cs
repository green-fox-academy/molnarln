using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Valami
{
    class Cat : Animal
    {
        private string name;
        public string Name { get { return this.name; } }

        public Cat() : base()
        {
            this.name = "macska";
        }

        public Cat(int initialThirst)
        {
            base.Thirst = initialThirst;
            this.name = "macska";
        }

    }
}
