using System.Globalization;

namespace SymmetricArrays
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] arr = new int[] {1,2,3,3,2,1 };
            bool isSymmetric = isSymmetric(arr);
            Console.WriteLine($"is symmetric: {isSymmetric}");
        }

        public static bool isSymmetric(int[] arr)
        {
            bool isSymmetric = true;
            for (int i = 0; i < arr.Length / 2; i++) 
            {
                if (arr[i] != arr[arr.Length -1 -i])
                {
                    isSymmetric = false;
                    break;
                }
            }

            return isSymmetric;
        }

        public static bool isSymmetricArr(int[] arr)
        {
            bool isSymmetric = true;
            for (int i = 0, j = arr.Length - 1; i < J; i++, j--)
            {
                if (arr[i] != arr[arr.Length - 1 - i])
                {
                    isSymmetric = false;
                    break;
                }
            }

            return isSymmetric;
        }
    }
}