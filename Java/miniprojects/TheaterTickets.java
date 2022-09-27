package gr.aueb.cf.miniprojects;
import java.util.Scanner;
import java.io.IOException;

/**
 * Πρόγραμμα διαχείρισης θεάτρου.
 * Δημιουργεί έναν πίνακα 30 γραμμών και 12 στηλών
 * που αντιπροσωπεύουν τις θέσεις του θεάτρου.
 * Ο χρηστής επιλεγεί τη θέση και το πρόγραμμα ελέγχει αμα είναι αδεία.
 * Αμα είναι αδεία την κρατάει. Αμα είναι κρατημένη την ακυρώνει.
 * Στη συνεχεία ρωτάει τον χρηστή αμα θέλει να συνεχίσει.
 */
public class TheaterTickets {

    // Δημιουργία πίνακα
    public static boolean[][] seats=new boolean[30][12];

    public static void main(String[] args)throws IOException {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner sc = new Scanner(System.in);
        char column = ' ';
        int row = 0;
        char choice = ' ';
        String continues = " ";

        // Εντολές While
        while ( !continues.equals("N") ){

            System.out.println("Καλώς ήρθατε στο πρόγραμμα διαχείρισης θεάτρου");
            System.out.println("Δώσε μου την στήλη. Γράμματα απο A εως L");
            column = (char) System.in.read();
            System.out.println("Δώσε μου την σειρά. Αριθμοί απο 1 εως 30");
            row = sc.nextInt();

            if (seats [row-1] [ 11 - ( 76 - (int) column ) ] == true){
                System.out.println("Η θέση είναι ηδη κατειλημμένη. Θέλετε να την ακυρώσετε. 'Y' για Ναι, 'N' για Οχι  ");
                choice = (char) System.in.read();

                if ( ( choice == 'Y' ) || ( choice == 'y' ) ){

                    cancel(column, row);
                    System.out.println("Η θέση ακυρώθηκε");

                } else {

                    System.out.println("Η θέση παρέμεινε κατειλημμένη.");

                }

            } else {

                System.out.println("Η θέση είναι αδεία. Θέλετε να την κρατήσετε. 'Y' για Ναι, 'Ν' για Οχι");
                choice = (char) System.in.read();

                if ( ( choice == 'Y' ) || ( choice == 'y' ) ){

                    book(column,row);
                    System.out.println("Η θέση κρατήθηκε");

                } else {

                    System.out.println("Η θέση παρέμεινε αδεία.");

                }

            }

            System.out.println("Θέλετε να συνεχίσετε; 'Y' για Ναι, 'N' για Οχι");
            continues = sc.next();

        }

        System.out.println("Ευχαριστούμε που μας προτιμήσατε. See you next time!");

    }

    /**
     * Μεθοδος που κάνει κράτηση μιας συγκεκριμένης θέσης τπυ θεάτρου
     * @param column    Η στήλη της θέσεως
     * @param row       Η σειρά της θέσεως
     */
    public static void book(char column, int row){

        // Επιλογή Θέσης
        seats[row-1][ 11 - ( 76 - (int)column ) ] = true;

    }

    /**
     * Μέθοδος που ακυρώνει την κράτηση μιας συγκεκριμένης θέσεως του θεάτρου
     * @param column    Η στήλη της θέσεως
     * @param row       Η σειρά της θέσεως
     */
    public static void cancel(char column, int row){

        seats[row-1][ 11 - ( 76 - (int)column ) ] = false;

    }

}
