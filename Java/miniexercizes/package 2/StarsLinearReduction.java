package gr.aueb.cf.chapter4;

/**
 * Πρόγραμμα που εμφανίζει αστεράκια με
 * γραμμική επιβράδυνση ξεκινώντας απο το 10.
 * Δηλαδή στη 1 γραμμή θα εμφανίσει 10 αστεράκια,
 * στη 2 γραμμή θα εμφανίσει 9 κτλ.
 */

public class StarsLinearReduction {

    public static void main(String[] args) {

        //Εντολές for
        for (int i = 1 ; i <= 10 ; i++){

            for (int j = 10; j >=i ; j--){

                System.out.print("*");

            }

            System.out.println();

        }
    }
}
