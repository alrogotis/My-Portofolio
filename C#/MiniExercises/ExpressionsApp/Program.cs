namespace ExpressionsApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int num1 = 1;
            int num2 = 2;
            int sum, sub, mul, div, mod, result1, result2, finalResult = 0;

            sum = num1 + num2;
            sub = num1 - num2;
            mul = num1 * num2;
            div = num1 / num2;
            mod = num1 % num2;

            result1 = sum++;
            result2 = ++sub;

            mul += 2;

            finalResult = (num1 + num2) * (num2 / num1++) % num2;

            Console.WriteLine($"{finalResult}");

            
        }
    }
}