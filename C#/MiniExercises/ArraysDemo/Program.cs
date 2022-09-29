namespace ArraysDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] arr1 = new int[3];
            int[] arr2 = {1,2,3,4,5};
            int[] arr3 = new int[] {1,2,3};

            arr1[0] = 0;
            arr1[1] = 1;
            arr1[2] = 2;

            for (int i = 0; i < arr1.Length; i++)
            { 
                Console.WriteLine(arr1[i]);
            }

            foreach (int item in arr1)
            {
                Console.Write(" " + item);
            }

            foreach (int el in arr2)
            { 
                
            }
        }
    }
}