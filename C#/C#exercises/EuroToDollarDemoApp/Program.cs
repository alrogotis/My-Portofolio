namespace EuroToDollarDemoApp
{
    /// <summary>
    /// Πρόγραμμα μετατροπής Ευρώ σε Δολάρια.
    /// Δίνει ο χρήστης το ποσό σε Ευρώ και το πρόγραμμα
    /// το μετατρέπει σε δολάρια , με βιάση μια σταθερά.
    /// </summary>
    internal class Program
    {
        static void Main(string[] args)
        {
            //Μεταβλητές
            const int ISOTIMIA = 116;
            double euros = 0.0;
            double dollars = 0.0;
            
            Console.WriteLine("Δώσε αριθμό EUROS");
            
            euros =  double.Parse(Console.ReadLine());

            // Μετατροπή σε δολάρια (με ακρίβεια 2 δεκαδικών ψηφίων)
            dollars = Math.Round(((euros * ISOTIMIA) / 100),2) ;

            // Εμφάνιση αποτελέσματος
            Console.WriteLine($"Τα {euros} Ευρώ είναι {dollars} δολάρια");
        }
    }
}