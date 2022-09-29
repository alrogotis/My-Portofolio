using System.Globalization;

namespace LocalizationApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            DateTime date = new DateTime(2022, 09, 07, 20, 26, 30);
            Thread.CurrentThread.CurrentCulture = CultureInfo.GetCultureInfo("el-GR");
            Console.WriteLine("{0:N}", 1234, 56);
        }
    }
}