namespace IgnorePositiveApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int count = 0;

            try 
            {
                while (true)
                {
                    if (!int.TryParse(Console.ReadLine(), out var num))
                    {
                        Console.WriteLine("input error");
                        break;
                    }
                    else
                    {
                        if (num < 0)
                        {
                            break;
                        }
                        else
                        {
                            count++;
                        }


                    }
                }
            }
            catch (Exception e) 
            {
                Console.WriteLine(e);
            }

            
        }
    }
}