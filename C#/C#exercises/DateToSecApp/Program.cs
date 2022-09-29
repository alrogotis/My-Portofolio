namespace DateToSecApp
{
    /// <summary>
    /// Μετατροπή του αριθμού ήμερων, όρων, λεπτών, δευτερολέπτων
    /// που δίνει ο χρήστης σε δευτερόλεπτα. 
    /// </summary>
    internal class Program
    {
        static void Main(string[] args)
        {
            // Μεταβλητές
            const int DaySec = 86_400;
            const int HourSec = 3_600;
            const int MinuteSec = 60;

            int seconds = 0;
            int days = 0;
            int hours = 0;
            int minutes = 0;
            int sumSec = 0;

            Console.WriteLine("Δώσε μέρες, ώρες, λεπτά, δευτερόλεπτα");

            //Εισαγωγή δεδομένων
            Console.Write("Δώσε μέρες: ");
            days = int.Parse(Console.ReadLine());

            Console.Write("Δώσε ώρες: ");
            hours = int.Parse(Console.ReadLine());

            Console.Write("Δώσε λέπτα: ");
            minutes = int.Parse(Console.ReadLine());

            Console.Write("Δώσε δευτερόλεπτα: ");
            seconds = int.Parse(Console.ReadLine());

            //Υπολογισμός αποτελέσματος
            sumSec = (days*DaySec)+(hours*HourSec)+(minutes*MinuteSec)+seconds;

            //Εμφάνιση αποτελέσματος
            Console.WriteLine($"Οι {days} μέρες, {hours} ώρες, {minutes} λέπτα, {seconds} δευτερόλεπτα, είναι {sumSec} δευτερόλεπτα");


        }
    }
}