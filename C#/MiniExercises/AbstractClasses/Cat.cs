using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AbstractClasses
{
    internal class Cat : AbstractAnimal
    {
        public override void Speak()
        {
            Console.WriteLine("Cat says Hello");
        }

        public override void Eat()
        {
            Console.WriteLine("Cat is eating");
        }

        public override string ToString()
        {
            return "Id" + Id + ", Name: " + Name + ", Age: " + Age;
        }
    }
}
