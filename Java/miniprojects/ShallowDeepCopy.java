package gr.aueb.cf.miniprojects;

import java.util.Arrays;

/**
 * Πρόγραμμα αντιγραφής δισδιάστατου πίνακα,
 * με shallow και deep copy αντίστοιχα.
 */
public class ShallowDeepCopy {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        int[][] arr = {{1,2,3},{4,5,6}};
        int[][] shallowCopied = shallowCopy(arr);
        int[][] arr2 = {{2,5,7},{1,3,8}};
        int[][] deepCopied = deepCopy(arr2);

        System.out.println("Παράδειγμα shallow copy και deep copy Σε δισδιάστατο πίνακα");
        System.out.println();

        // Εμφάνιση πρώτου πίνακα καθώς και το αντίγραφο του
        System.out.println("Shallow copy");
        System.out.println("Πρώτος Πίνακας : "+ Arrays.deepToString(arr));
        System.out.println();
        System.out.println("Αντίγραφο : "+Arrays.deepToString(shallowCopied));
        System.out.println();

        arr[0][0]=10;

        //Εμφάνιση αλλαγών
        System.out.println("Αλλαγή στοιχειού πρώτου πίνακα");
        System.out.println("Πρώτος Πίνακας : "+ Arrays.deepToString(arr));
        System.out.println();
        System.out.println("Αλλάχτηκε και ο shallow copy πίνακας που δεν το θέλαμε");
        System.out.println("Αντίγραφο : "+Arrays.deepToString(shallowCopied));
        System.out.println();

        // Εμφάνιση δευτέρου πίνακα καθώς και το αντίγραφο του
        System.out.println("Deep copy");
        System.out.println("Δεύτερος Πίνακας : "+Arrays.deepToString(arr2));
        System.out.println();
        System.out.println("Αντίγραφο : "+Arrays.deepToString(deepCopied));
        System.out.println();


        arr2[1][1]=50;

        // Εμφάνιση αλλαγών
        System.out.println("Αλλαγή στοιχειού δευτέρου πίνακα");
        System.out.println("Δεύτερος Πίνακας : "+Arrays.deepToString(arr2));
        System.out.println();
        System.out.println("Το αντίγραφο του δευτέρου πίνακα δεν αλλάχτηκε το οποίο είναι αυτό που θέλουμε");
        System.out.println("Αντίγραφο : "+Arrays.deepToString(deepCopied));


    }

    /**
     * Μέθοδος που αντιγραφεί έναν δισδιάστατο πίνακα,
     * με shallow copy
     * @param arr   Ο αρχικός πίνακας
     * @return      Το αντίγραφο του αρχικού πίνακα
     */
    public static int[][] shallowCopy(int[][]arr){

        int[][] shallowCopy = arr;
        return shallowCopy;

    }

    /**
     * Μέθοδος που αντιγραφεί έναν δισδιάστατο πίνακα
     * με deep copy
     * @param arr   Ο αρχικός πίνακας
     * @return      Το αντίγραφο του αρχικού πίνακα
     */
    public static int[][] deepCopy(int[][] arr){

        int deepCopy[][] = new int[arr.length][];

        for (int i = 0; i < arr.length; i++){

            deepCopy[i]=new int[arr[i].length];

            for (int j = 0; j< arr[i].length; j++){
                deepCopy[i][j]=arr[i][j];
            }

        }

        return deepCopy;

    }


}
