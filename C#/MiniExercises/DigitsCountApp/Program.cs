namespace DigitsCountApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int numberOfDigits = 0;
            result = 0;

            try
            {
                Console.WriteLine("Please insert an int");
                if (!int.TryParse(Console.ReadLine(), out int num))
                {
                    Console.WriteLine("Error Input");
                }
                else
                {
                    result = num;
                    do
                    {
                        result /= 10;
                        numberOfDigits++;
                    } while (result != 0)
    

            }

            } catch (Exception e)
            { 
                Console.WriteLine(e);
            }


            
        }
    }
}