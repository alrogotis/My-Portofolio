namespace VarArgsDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            PrintSum(10.5M, 9.2M);
            PrintSum(12.5M, 5.2M, 19.2M);
            PrintName();
            PrintName("Alice", "Cooper");

        }

        public static void PrintSum(params decimal[] prices) 
        {
            decimal sum = 0M;
            foreach (decimal price in prices) 
            {
                sum += price;
            }

            Console.WriteLine(sum);
        }

        public static void PrintName(string firstname = "Coding", string lastname = "Factory")
        {
            Console.WriteLine(firstname + " ");
            Console.WriteLine(lastname);
        }
    }
}