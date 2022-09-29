namespace FractionApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            var a = new Fraction(2, 12);
            var b = new Fraction(1, 2);

            Console.WriteLine(-a);
            Console.WriteLine(a+b);
            Console.WriteLine(a-b);
            Console.WriteLine(a/b);
            Console.WriteLine(a * b);
        }
    }
}