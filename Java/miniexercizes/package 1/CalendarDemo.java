package gr.aueb.cf.chapter1;

import java.util.Scanner;

/**
 * Πρόγραμμα που διαβάζει τρεις ακεραίους
 * απο τον χρηστή που αναπαριστούν
 * την ημέρα, τον μηνά και το έτος
 * και την εμφανίζει σε μορφή ΗΗ/ΜΜ/ΕΕ
 */
public class CalendarDemo {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        System.out.println("Δώσε μου αριθμό ημέρας : ");
        int dayNumber =in.nextInt();
        System.out.println("Δώσε μου αριθμό μηνά : ");
        int monthNumber =in.nextInt();
        System.out.println("Δώσε μου αριθμό έτους : ");
        int yearNumber=in.nextInt();

        //Εμφάνιση Αποτελεσμάτων
        System.out.printf("Η ημερομηνία που μου έδωσες είναι : %02d/%02d/%d",dayNumber,monthNumber,yearNumber);

    }


}
