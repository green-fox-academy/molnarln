using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Valami
{
    class Cat : Animal
    {
        public Cat() : base()
        {
        }

        public Cat(int initialThirst)
        {
            base.thirst = initialThirst;
        }

    }
}
