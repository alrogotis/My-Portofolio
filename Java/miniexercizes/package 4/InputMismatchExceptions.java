package gr.aueb.cf.chapter8;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Πρόγραμμα που εμφανίζει
 * ενα μενού με επιλογές.
 * Αναλόγως την επιλογή
 * εμφανίζει τα κατάλληλα μηνύματα
 * προς τον χρηστή και επίσης διαχειρίζεται (με try and catch) την
 * περίπτωση που ο χρηστής γράψει string και οχι ακέραιο (InputMismatchException).
 */
public class InputMismatchExceptions {

    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        //Εντολές
        menu();

        while(choice != 5){
            try {
                choice = throwException ( choice , sc );
                choiceResult ( choice );

            } catch ( InputMismatchException e ) {
                System.out.println("Δώσατε μη ακέραια τιμή. Παρακάλα ξαναπροσπαθήστε:");
            }
        }

        sc.close();

        //Μήνυμα εξόδου
        System.out.println("Επιλέξατε ΕΞΟΔΟ. Goodbye!");

    }

    /**
     * Μέθοδος που επιστρέφει την επιλογή ενός χρηστή
     * και διαχειρίζεται (με try and catch) την περίπτωση που ο χρηστής
     * δώσει string και οχι ακέραιο (InputMismatchException)
     *
     * @param choice    Η επιλογή του Χρηστή
     * @param sc        Ο Scanner που βάζει την επιλογή του ο χρηστής
     * @return          Τήν μεταβλητή choice
     * @throws InputMismatchException
     */
    public static int throwException(int choice,Scanner sc)throws InputMismatchException{
            try {
                choice = sc.nextInt();
                return choice;

            } catch ( InputMismatchException e ) {
                e.printStackTrace();
                sc.nextLine();
                throw e;
            }
        }

    /**
     * Μέθοδος που εμφανίζει ενα μενού με επιλογές.
     */
    public static void menu(){
        System.out.println("Μενού Προγράμματος: ");
        System.out.println("1. ΕΠΙΛΟΓΗ");
        System.out.println("2. ΕΙΣΑΓΩΓΗ");
        System.out.println("3. ΕΠΕΞΕΡΓΑΣΙΑ");
        System.out.println("4. ΔΙΑΓΡΑΦΗ");
        System.out.println("5. ΕΞΟΔΟΣ");
        System.out.println("Δώστε μια επίλογε. Παρακαλώ ακέραια τιμή απο 1 εως  το 5.");
    }

    /**
     * Μέθοδος που εμφανίζει τα κατάλληλα μηνύματα,
     * συμφωνά με την επιλογή του χρηστή.
     *
     * @param choice    Η επιλογή του χρηστή
     */
    public static void choiceResult( int choice ) {

        if( choice <= 0 || choice > 5 ) {
            System.out.println("Δώσατε λάθος επιλογή. Παρακαλώ ξαναπροσπαθήστε");
        } else if ( choice == 1 ) {
            System.out.println("Επιλέξατε ΕΠΙΛΟΓΗ");
        } else if ( choice == 2 ) {
            System.out.println("Επιλέξατε ΕΙΣΑΓΩΓΗ");
        } else if ( choice == 3 ) {
            System.out.println("Επιλέξατε ΕΠΕΞΕΡΓΑΣΙΑ");
        } else if ( choice == 4 ) {
            System.out.println("Επιλέξατε ΔΙΑΓΡΑΦΗ");
        }
    }
}
