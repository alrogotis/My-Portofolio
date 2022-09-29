namespace CharReadApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int charCode = ' ';
            char ch;

            do
            {
                try
                {
                    charCode = Console.Read();
                    ch = (char)charCode;
                    Console.WriteLine($"char: {ch}, char-code {charCode}");
                } catch (Exception e)
                { 
                    Console.WriteLine($"{e.StackTrace}");
                }
                
            } while (charCode != 10);
        }
    }
}