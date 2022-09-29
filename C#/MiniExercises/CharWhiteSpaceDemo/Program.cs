using System;

namespace CharWhiteSpaceDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int charCode = ' ';

            do
            {
                try 
                {
                    charCode = Console.Read();
                    if (charCode != ' ' && charCode != '*')
                    {
                        Console.WriteLine((char)charCode);
                    }

                } catch (Exception e)
                {
                    Console.WriteLine(e);
                }

            } while (charCode != '*');
        }
    }
}