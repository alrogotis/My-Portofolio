namespace MultiDimensionArrays
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[,] arr = new int[3, 4];
            int[,] arr2 = { { 1, 2, 3 }, { 4, 5, 6 } };

            int[,,] arr3 = new int[1, 2, 3];

            int[][] jagged = new int[2][];
            jagged[0] = new int[4];
            jagged[1] = new int[2];

            for (int i = 0; i < arr2.GetLength(0); i++)
            {
                for (int j = 0; j < arr2.GetLength(1); j++)
                {
                    Console.Write($"{arr2[i, j]} ");

                }
                Console.WriteLine();
            }
        } 
    }
}