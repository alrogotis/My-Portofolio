package gr.aueb.cf.chapter4;

/**
 * Πρόγραμμα που εμφανίζει 10 αστεράκια
 * τόσο οριζόντια όσο και κάθετα
 */

public class TenStarsHV {

    public static void main(String[] args) {

        // Εντολές for
        for (int i = 0 ; i < 10 ; i++){

            for (int j = 0; j < 10; j++){

                System.out.print("*");

            }

            System.out.println();
        }
    }
}
