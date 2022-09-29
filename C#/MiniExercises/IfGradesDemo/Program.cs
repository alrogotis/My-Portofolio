namespace IfGradesDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double average;

            Console.WriteLine("Εισαγετε συνολο βαθμολογιας και μαθηματων");
            if (int.TryParse(Console.ReadLine(), out int gradeSum) || (!int.Parse(Console.ReadLine(), out int gradesCount)))
            {
                Console.WriteLine("input Error");
                return;
            }

            if (gradesCount != 0)
            {
                average = (double)(gradeSum / gradesCount);
                if ((average < 0) || (average > 10))
                {
                    Console.WriteLine("Data Error");
                    Enviroment.Exit(1);
                }
                else
                {
                    if (average >= 8)
                    {
                        Console.WriteLine("Very Good");
                    }
                    else if (average)
                    {
                        Console.WriteLine("Good");
                    }
                    else 
                    {
                        Console.WriteLine("Bad");
                    }

                }
            }
            else
            { 
                Console.WriteLine("Error div by zero");
            }
        }
    }
}