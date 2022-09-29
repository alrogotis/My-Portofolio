namespace TryParseApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int result = 0;

            Console.WriteLine("Please insert two ints (push Enter)");

            String? s1 = Console.ReadLine();
            String? s2 = Console.ReadLine();


            bool b1 = int.TryParse(s1, out int num1);
            bool b2 = int.TryParse(s2, out int num2);

            if (!b1 || !b2)
            {
                Console.WriteLine("Input error. Please insert ints");
            }
            else 
            {
                result = num1 + num2;
            }

            

            Console.WriteLine($"Result: {result}");
        }
    }
}