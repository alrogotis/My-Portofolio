namespace MinArrayDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] ages = new int[] { 23, 34, 17, 20 };
            int minPosition = 0;
            int maxPosition = 0;

            for (int i = 0; i < ages.Length; i++)
            {
                if (ages[i] < ages[minPosition])
                {
                    minPosition = i;
                }
                if (ages[i] > ages[maxPosition])
                { 
                    maxPosition = i;
                }
            }

            Console.WriteLine($"MinPosition: {minPosition}, MinValue: {ages[minPosition]}");
            Console.WriteLine($"MinPosition: {maxPosition}, MaxValue: {ages[maxPosition]}");

        }
    }
}