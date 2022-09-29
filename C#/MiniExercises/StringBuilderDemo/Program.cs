using System.Text;

namespace StringBuilderDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string s = "";
            StringBuilder sb = new StringBuilder();
            long startTime , endTime = 0;
            double elapsed;

            DateTime date = DateTime.Now;
            startTime = date.Millisecond;

            for (int i = 1; i <= 50_000; i++)
            {
                s += i;
            }

            endTime = DateTime.Now.Millisecond;
            elapsed = (endTime - startTime) / 1000D;

            Console.WriteLine($"String Elapsed Time Concat = {elapsed:N2} secs");
        }
    }
}