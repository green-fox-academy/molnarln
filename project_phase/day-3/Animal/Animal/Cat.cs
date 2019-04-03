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
        public string Name
        {
            get
            {
                return this.name == string.Empty ? "N/A" : this.name;
            }
            set
            {
                this.name = value;
            }
        }

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
