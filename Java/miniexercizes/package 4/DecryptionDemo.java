package gr.aueb.cf.chapter7;

import java.util.Scanner;

/**
 * Πρόγραμμα αποκρυπτογράφησης
 * Αντικαθιστά τον κάθε χαρακτήρα,
 * ενός string που έδωσε ο χρηστής
 * με τον αμέσως προηγούμενο,
 * συμφωνά με τον κωδικά ASCII και στο τέλος
 * εμφανίζει το αποκρυπτογραφημένο μήνυμα.
 */

public class DecryptionDemo {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner sc = new Scanner(System.in);
        String cryptoMessage = "";
        String realMessage = "";
        char chNow = ' ';
        char realChar = ' ';

        //Εντολές
        System.out.println("Δώσε μου το μήνυμα που θέλεις να αποκρυπτογραφήσω");
        cryptoMessage = sc.next();
        for ( int i = 0 ; i < cryptoMessage.length() ; i++) {
            chNow = cryptoMessage.charAt(i);
            realChar = (char) (chNow - 1);
            realMessage = realMessage + realChar;
        }

        //Εμφάνιση αποτελεσμάτων
        System.out.printf("Αποτέλεσμα αποκρυπτογράφησης: %s", realMessage);
    }

}
