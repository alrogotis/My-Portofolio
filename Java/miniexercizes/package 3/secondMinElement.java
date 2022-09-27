package gr.aueb.cf.chapter6;

/**
 *Πρόγραμμα που υπολογίζει και εμφανίζει,
 * το δεύτερο μικρότερο στοιχειό,
 * ενός πίνακα.
 */
public class secondMinElement {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        int [] numbers = {12, 8, 22, 20, 5, 10};
        int minNum = Integer.MAX_VALUE;
        int minPos = -1;
        int secMinNum = Integer.MAX_VALUE;
        int secMinPos = -1;

        // Εντολές
        for ( int i = 0 ; i < numbers.length ; i++) {
            if ( numbers [i] < minNum) {
                secMinNum = minNum;
                secMinPos = minPos;
                minNum = numbers[i];
                minPos = i;
            } else if (( numbers[i] < secMinNum ) && ( numbers[i] != minNum )) {
                secMinNum = numbers[i];
                secMinPos = i;
            }
        }

        // Εμφάνιση αποτελεσμάτων
        System.out.printf("Το μικρότερο στοιχειό του πίνακα είναι το %d και βρίσκεται στην θέση %d", secMinNum, secMinPos);
    }
}
