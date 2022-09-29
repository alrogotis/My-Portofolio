namespace PowerDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n = 0;
            int a = 0;
            int result = 1;
            int i = 1;

            Console.WriteLine("Please insert base, power");

            if (int.TryParse(Console.ReadLine(),  out a) || (!int.TryParse(Console.ReadLine(), out n)))
            {
                Console.WriteLine("Input Error");
            }
            else
            {
                while (i <= n)
                {
                    result *= a;
                    i++;
                }

                Console.WriteLine($"{a}^{n} = {result}");
            }
        }
    }
}