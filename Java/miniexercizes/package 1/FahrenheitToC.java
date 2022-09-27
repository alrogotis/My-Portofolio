package gr.aueb.cf.chapter1;

import java.util.Scanner;

/**
 * Πρόγραμμα που μετατρέπει
 * τους βαθμούς Φαρενάιτ
 * που δίνει ο χρηστής
 * σε βαθμοί Κέλσιου
 * και εμφανίζει το αποτέλεσμα
 *
 */

public class FahrenheitToC {
    public static void main(String[] args) {
        System.out.print("Δώσε μου την θερμοκρασία σε Φαρενάιτ : ");

        //Δήλωση και Αρχικοποίηση μεταβλητών
        Scanner sc = new Scanner(System.in);
        int tempFahrenheit = sc.nextInt();
        int tempCelsius = 5 * (tempFahrenheit-32)/9;

        //Εμφάνιση Αποτελεσμάτων
        System.out.printf(" Οι %d βαθμοί F είναι %d βαθμοί C ", tempFahrenheit, tempCelsius);


    }
}
