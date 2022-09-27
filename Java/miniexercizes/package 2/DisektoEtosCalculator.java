package gr.aueb.cf.chapter3;

import java.util.Scanner;

/**
 * Πρόγραμμα που ζητάει άπο τον χρήστη να δώσει ένα έτος
 * και εμφανίζει άμα είναι δίσεκτο ή οχι.
 */

public class DisektoEtosCalculator {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        boolean isdisekto = false;
        int year = 0;

        System.out.println(" Πρόγραμμα πρόβλεψης δίσεκτου έτους!");
        System.out.print("Δώσε μου ένα έτος: ");

        // Εντολές
        year = in.nextInt();
        if ( ( ( year % 4 == 0 ) && ( year % 100 != 0 ) ) || ( ( year % 4 == 0 ) && ( year % 100 == 0 ) && ( year % 400 == 0 ) ) ) {

            isdisekto = true;

            // Εμφάνιση αποτελεσμάτων
            System.out.printf("Το έτος %d  είναι δίσεκτο." , year);

        } else {

            System.out.printf("Το έτος %d  δεν είναι δίσεκτο. " , year);
        }

    }
}
