using System;

namespace intTypesApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine($"int {typeof(int)}, {sizeof(int)}, {int.MinValue}, {int.MaxValue}");
            Console.WriteLine($"byte {typeof(byte)}, {sizeof(byte)}, {byte.MinValue}, {byte.MaxValue}");
            Console.WriteLine($"short {typeof(short)}, {sizeof(short)}, {short.MinValue}, {short.MaxValue}");
            Console.WriteLine($"long {typeof(long)}, {sizeof(long)}, {long.MinValue}, {long.MaxValue}");
            Console.WriteLine($"float {typeof(float)}, {sizeof(float)}, {float.MinValue}, {float.MaxValue}");
            Console.WriteLine($"double {typeof(double)}, {sizeof(double)}, {double.MinValue}, {double.MaxValue}");
            Console.WriteLine($"decimal {typeof(decimal)}, {sizeof(decimal)}, {decimal.MinValue}, {decimal.MaxValue}");
            Console.WriteLine($"char {typeof(char)}, {sizeof(char)}, {char.MinValue}, {char.MaxValue}");
            Console.WriteLine($"bool {typeof(bool)}, {sizeof(bool)}");
        }
    }
}