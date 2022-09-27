namespace SecToDayHourMinitesSec
{
    /// <summary>
    /// Πρόγραμμα μετατροπής Δευτερολέπτων σε μέρες, ώρες, λεπτά, δευτερόλεπτα.
    /// Δίνει ο χρήστης τον αριθμό των δευτερολέπτων και στον χρήστη εμφανίζεται,
    /// Το αποτέλεσμα σε μέρες, ώρες, λεπτά, και δευτερόλεπτα.
    /// </summary>
    internal class Program
    {
        static void Main(string[] args)
        {
            //Μεταβλητές
            const int DaySec = 86_400;
            const int HourSec = 3_600;
            const int MinuteSec = 60;

            int remainSec = 0;
            int seconds = 0;
            int days = 0;
            int hours = 0;
            int minutes = 0;

            Console.WriteLine("Δώσε αριθμό δευτερολέπτων");

            //Εντολές
            seconds = int.Parse(Console.ReadLine());

            days = seconds / DaySec;
            remainSec = seconds % DaySec;

            hours = remainSec / HourSec;
            remainSec = remainSec % HourSec;

            minutes = remainSec / MinuteSec;
            remainSec = remainSec % MinuteSec;

            //Εμφάνισή αποτελέσματος
            Console.WriteLine($"Τα {seconds} δευτερόλεπτα, είναι {days} μέρες, {hours} ώρες , {minutes} λεπτά και {remainSec} δευτερόλεπτα");



        }
    }
}