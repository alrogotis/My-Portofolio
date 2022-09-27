package gr.aueb.cf.chapter4;

/**
 * Πρόγραμμα που εμφανίζει αστεράκια με γραμμική αύξηση.
 * Δηλαδή στη 1 γραμμή εμφανίζει 1 αστέρι,
 * στη 2 γραμμή εμφανίζει 2 κτλ.
 */

public class StarsLinearGrowth {

    public static void main(String[] args) {

        // Εντολές for
        for (int i = 1 ; i <= 10 ; i++){

            for (int j = 1; j <= i ; j++){

                System.out.print("*");

            }

            System.out.println();
        }
    }
}
