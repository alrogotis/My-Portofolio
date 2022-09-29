using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FractionApp
{
    internal sealed class Fraction
    {
        private readonly int num;
        private readonly int den;

        public int Num { get { return num; } }
        public int Den { get { return den; } }

        public Fraction() { }

        public Fraction(int num, int den)
        {
            if (den == 0)
            {
                throw new ArgumentException();
            }

            Num = num;
            Den = den;
        }

        public static Fraction operator +(Fraction a, Fraction b) => new Fraction(a.Num * b.Den + b.Num * a.Den, a.Den * b.Den);

        public static Fraction operator +(Fraction a) => a;

        public static Fraction operator -(Fraction a) => new Fraction(- a.Num, a.Den);

        public static Fraction operator -(Fraction a, Fraction b) => a + (-b);

        public static Fraction operator *(Fraction a, Fraction b) => new Fraction( a.Num * b.Num, a.Den * b.Den);

        public static Fraction operator /(Fraction a, Fraction b) 
        {
            if (base.Num == 0)
            {
                throw new DivideByZeroException();
            }
            return new Fraction(a.Num / b.Num, a.Den / b.Den);
        }




    }
}
