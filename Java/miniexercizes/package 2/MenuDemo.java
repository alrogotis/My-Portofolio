package gr.aueb.cf.chapter3;

import java.util.Scanner;

/**
 * Πρόγραμμα εμφάνισης μενού
 * οπού ζητάει απο τον χρηστή
 * να κάνει μια επιλογή και αναλόγως
 * την επιλογή εμφανίζει
 * το ανάλογο μήνυμα.
 */

public class MenuDemo {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int selection = 0;

        //Αρχή do-while
        do {

            System.out.println("Μενού επιλόγων προγράμματος");
            System.out.println("Επιλέξτε μια άπο τις παρακάτω επιλογές:");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            System.out.println("Δώσε μια επιλογή:");
            selection = in.nextInt();

            if (selection < 0 || selection > 5) {

                System.out.println("Δώσατε λάθος επιλογή. Παρακαλώ ξαναπροσπαθήστε!");

            } else if (selection == 1) {

                System.out.println("Επιλέξατε Εισαγωγή");

            } else if (selection == 2) {

                System.out.println("Επιλέξατε Διαγραφή");
            } else if (selection == 3) {

                System.out.println("Επιλέξατε Ενημέρωση");
            } else if (selection == 4) {

                System.out.println("Επιλέξατε Αναζήτηση");
            }

        }while (selection != 5); // Τέλος do-while

        System.out.println("Επιλέξατε Έξοδος");
        System.out.println("Τα λέμε την επόμενη φόρα");
    }
}
