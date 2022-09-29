namespace ForDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int sum = 0;
            int mul = 1;

            for (int i = 1; i <= 10; i++)
            {
                sum += i;
                mul *= i;
            }

            Console.WriteLine($"Sum: {sum}, mUL {mul}");
        }
    }
}