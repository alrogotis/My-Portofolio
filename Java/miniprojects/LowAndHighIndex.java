package gr.aueb.cf.miniprojects;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Πρόγραμμα εύρεσης στοιχειού ενός πίνακα.
 * Βρίσκει την low και τη high του θέση και τις
 * αποθηκεύει σε έναν πίνακα τον οποίο και εμφανίζει.
 * Ο πίνακας είναι ηδη γνωστός και ταξινομημένος
 * κατά αύξουσα σειρά.
 */
public class LowAndHighIndex {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner sc = new Scanner(System.in);
        int[] arr = {0,1,4,4,4,6,7,8,8,8,8,9};
        int key = 0;
        int[]lowAndHigh = new int[2];

        //Εντολές
        System.out.print("Πίνακας arr = {");
        for (int i = 0; i < arr.length-1 ; i++){
            System.out.printf("%d,", arr[i]);
        }
        System.out.printf("%d}%n", arr[arr.length-1]);
        System.out.println("Δώσε μου έναν αριθμό");
        key = sc.nextInt();
        lowAndHigh = getLowAndHighIndexOf(arr , key);

        //Εμφάνιση αποτελεσμάτων
        System.out.printf("{ %d, %d }" , lowAndHigh[0] , lowAndHigh[1]);

    }

    /**
     * Μέθοδος εύρεσης του low και high θέσης ενός στοιχειού του πίνακα.
     * Αναζητά αμα υπάρχει το στοιχειό, βρίσκει την αρχική και τελική του θέση
     * και τις αποθηκεύει σε έναν πίνακα. Η μέθοδος δουλεύει μονό σε πινάκες ηδη ταξινομημένους.
     * @param arr   Ο δοσμένος πίνακας
     * @param key   Το στοιχειό το οποίο ψάχνουμε
     * @return      Την αρχική και τελική θέση του στοιχειού μέσα σε έναν πίνακα
     */
    public static int[] getLowAndHighIndexOf(int[]arr,int key){

        //Δήλωση και αρχικοποίηση μεταβλητών
        int pivot = 0;
        int low = -1;
        int high = -1;
        int instances = 0;
        boolean exist = false;

        //Εντολές while
        while (pivot < arr.length){
            if (arr [pivot] == key){
                exist = true;
                low = pivot;
                break;
            }else {
                pivot++;
            }
        }

        // Εύρεση αρχικής και τελικής θέσης του στοιχειού
        if (exist == false){
            System.out.print("Ο αριθμός δεν βρέθηκε. ");
        }else {
            System.out.print("Ο αριθμός βρέθηκε στις θέσεις: ");
            for (int i = low ; i < arr.length; i++){
                if (arr[i] == key){
                    instances++;
                }
            }
            high = ( low + instances ) -1;
        }

        //Δημιουργία πίνακα θέσεων του στοιχειού
        int[] lowAndHigh = { low , high };

        //Επιστροφή τιμών του πίνακα
        return lowAndHigh;
    }
}
