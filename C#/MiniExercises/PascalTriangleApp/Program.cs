namespace PascalTriangleApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            const int HEIGHT = 10;

            int[][] arr = new int[HEIGHT][];

            for (int i = 0; i < HEIGHT; i++) 
            {
                arr[i] = new int[i + 1];
            }

            arr[0][0] = 1;
            for (int i = 0; i < HEIGHT -1; i++) 
            {
                for (int j = 0; j <= i; j++) 
                {
                    arr[i + 1][j] += arr[i][j];
                    arr[i + 1][j+1] += arr[i][j];
                }    
            }

            for (int i = 0; i < HEIGHT; i++) 
            {
                Console.Write(" ".PadLeft((HEIGHT - i) * 2));
                //for (int p = 1; p <= (HEIGHT - i)*2; p++)
                for (int j = 0; j <= i; j++) 
                {
                    Console.Write("{0,4}", arr[i][j]);
                }
                Console.WriteLine();
            }
        }
    }
}