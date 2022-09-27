package gr.aueb.cf.chapter1;
/**
 * Δημιουργία προγράμματος που δηλώνει δυο μεταβλητές,
 * αποθηκεύει το άθροισμα τους και τέλος
 * το εμφανίζει στην οθόνη
 *
 */
public class AddExercise {
    public static void main(String[] args) {

        // Δήλωση και Αρχικοποίηση μεταβλητών
        int num1 = 19;
        int num2 = 30;
        int sum = num1 + num2 ;

        // Εμφάνιση αποτελεσμάτων
        System.out.printf("Το αποτέλεσμα της πράξης %d + %d  είναι ίσο με %d ",num1,num2,sum);
    }
}
