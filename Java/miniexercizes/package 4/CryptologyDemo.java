package gr.aueb.cf.chapter7;

import java.util.Scanner;

/**
 * Πρόγραμμα κρυπτογράφησης.
 * Αντικαθιστά τον κάθε χαρακτήρα,
 * ενός string που θα δώσει ο χρηστής
 * με τον αμέσως επόμενο χαρακτήρα,
 * συμφωνά με τον κωδικά ASCII.
 * Στο τέλος εμφανίζει το κρυπτογραφημένο string.
 */

public class CryptologyDemo {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner sc = new Scanner(System.in);
        String message = "";
        String cryptoMessage = "";
        char chNow = ' ';
        char newChar = ' ';

        //Εντολές
        System.out.println("Δώσε μου το μήνυμα που θέλεις να κρυπτογραφήσω");
        message = sc.next();
        for ( int i = 0 ; i < message.length() ; i++) {
            chNow = message.charAt(i);
            newChar = (char) (chNow + 1);
            cryptoMessage = cryptoMessage + newChar;
        }

        //Εμφάνιση αποτελεσμάτων
        System.out.printf("Αποτέλεσμα κρυπτογράφησης: %s", cryptoMessage);
    }

}