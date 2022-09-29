namespace TernaryOpApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int inputNum = 0;
            int abs = 0;

            Console.WriteLine("insert an int");
            inputNum = int.Parse(Console.ReadLine());

            abs = (inputNum >=0) ? inputNum : -inputNum ;

            Console.WriteLine($"Abs of {inputNum} = {abs}");
        }
    }
}