namespace FiboDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine($"Fibo: {Fibo(5)}");
            Console.WriteLine($"Fibo: {Fibonacci(5)}");
            Console.WriteLine($"Fibo: {FiboRecursive(5)}");


        }

        public static int Fibo(int n)
        {
            int a = 0;
            int b = 1;
            int c = 1;

            for (int i = 0; i < n; i++)
            { 
                c = a + b;
                a = b;
                b = c;
            }

            return c;
        }

        public static int Fibonacci(int n)
        {
            int[] arr = new int[n + 1];
            arr[0] = 1;
            arr[1] = 2;

            for (int i = 2; i < n; i++)
            { 
                arr[i] = arr[i-1] + arr[i-2];
            }

            return arr[n];
        }

        public static int FiboRecursive(int n)
        {
            if (n > 2)
            {
                return FiboRecursive(n - 1) + FiboRecursive(n - 2);
            }
            else 
            {
                return 1;
            }
        }
    }
}