namespace MethodsDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int a = 10;
            int b = 20;
            Swap(ref a, ref b);
            Console.WriteLine($"a: {a}, b: {b}");

            string s = "Coding";
            string s1 = ChangeVal(ref s);
            Console.WriteLine($"s1: {s1}");
        }

        public static void Swap(ref int a, ref int b) 
        {
            int tmp = a;
            a = b;
            b = tmp;
        }

        public static string ChangeVal(ref string s) 
        {
            s = "New Val";
            return s;
        }
    }
}