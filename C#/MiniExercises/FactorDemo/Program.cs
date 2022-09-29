using System.Numerics;

namespace FactorDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n;
            int facto = 1;
            String? s;

            Console.WriteLine("Please insert n for n!");
            
            s = Console.ReadLine();
            
            n = int.Parse(s);

            for (int i = 1; i <= n; i++)
            {
                facto *= i;
            }

            Console.WriteLine($"n! = {facto:N0}");
        }
    }
}