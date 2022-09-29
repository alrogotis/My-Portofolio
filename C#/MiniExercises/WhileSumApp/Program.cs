namespace WhileSumApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int sum = 0;
            int i = 1;

            while (i <= 10)
            {
                sum += i;
            }

            Console.WriteLine($"Sum ");
        }
    }
}