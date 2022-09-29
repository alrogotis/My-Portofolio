namespace RightTriangleDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            const double EPSILON = 0.000005;
            bool isRight = false; 

            Console.WriteLine("Please insert a, b, c");
            if (!int.TryParse(Console.ReadLine(), out int a))
            {
                Console.WriteLine("Input Error");
            }
            if (!int.TryParse(Console.ReadLine(), out int b))
            {
                Console.WriteLine("Input Error");
            }
            if (!int.TryParse(Console.ReadLine(), out int c))
            {
                Console.WriteLine("Input Error");
            }

            isRight = Math.Abs(a * a - b * b - c * c) <= EPSILON;

            Console.WriteLine("Το τριγωνο{0} ειναι ορθογωνιο", (isRight) ? "" : " δεν ");
        }
    }
}