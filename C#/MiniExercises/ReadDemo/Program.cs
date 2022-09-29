namespace ReadDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Insert an int");
            String? s = Console.ReadLine();
            int num = int.Parse(s);
            Console.WriteLine(num);
        }
    }
}