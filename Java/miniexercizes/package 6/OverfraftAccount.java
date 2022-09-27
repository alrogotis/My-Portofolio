package gr.aueb.cf.chapter10;

/**
 * Παράδειγμα κλάσης υπερανάληψης ενός λογαριασμού.
 * Περιεχέι δυο μεθόδους, μια που υπολογίζει το ποσό που θα χρεωθεί ο πελάτης και
 * μια άλλη που θα υπολογίζει τη δόση.
 */
public class OverfraftAccount {

    private static double epitokio = 0.10;

    /**
     * Μέθοδος που υπολογίζει το ποσό που χρωστάει ο πελάτης
     * @param amount    το ποσό που ζήτησε να κάνει ανάληψη
     * @param balance   το υπόλοιπο του λογαριασμού του
     * @return          το ποσό που χρωστάει
     */
    public static double overfraftPayment(double amount, double balance){

        double payment = ((amount-balance)*epitokio)+(amount-balance) ;
        return payment;

    }

    /**
     * Μέθοδος που υπολογίζει τη δόση
     * @param payment   Το ποσό που χρωστάει ο πελάτης
     * @return          Τη μηνιαία δόση
     */
    public static double overfraftDose(double payment){

        double dosi = payment/12.0;
        return dosi;
        
    }


}
