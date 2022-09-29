namespace NullableApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string s1;
            string? s2;
            

            Console.WriteLine("Please insert two string values");
            s1= Console.ReadLine()!;
            s2 = Console.ReadLine();

            if ((s1.Equals("Coding")) && (s2!.Equals("Factory")))
            {
                Console.WriteLine("Coding Factory");
            }
            else
            {
                Console.WriteLine("");
            }
        }

        public static string? GetUpperString()
        {
            string? s1;

            Console.WriteLine("Please insert a string");
            s1 = Console.ReadLine()!;

            //if (s1 == null) return null; else return s1.ToUpper();
            return s1?.ToUpper();
        }
    }
}