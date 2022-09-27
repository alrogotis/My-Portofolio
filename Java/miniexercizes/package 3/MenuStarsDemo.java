package gr.aueb.cf.chapter5;

import java.util.Scanner;

/**
 * Πρόγραμμα που εμφανίζει ενα μενού με επιλογές
 * και αναλόγως την επιλογή,
 * εμφανίζει με διαφορετικό τρόπο
 * n αστεράκια.
 */
public class MenuStarsDemo {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int nStars = 0;

        // Εντολές
        do{
            showMenu();
            choice = sc.nextInt();
            choiceOptions(sc,choice,nStars);
        }while ( choice != 6);
        sc.close();

        // Μήνυμα εξόδου
        System.out.println("Επέλεξες έξοδο.");
        System.out.println("See you next time!");
    }

    /**
     * Μέθοδος που εμφανίζει ενα μενού με επιλογές
     */
    public static void showMenu(){
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1-n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n-1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
        System.out.println("Δώσε επιλογή: ");
    }

    /**
     * Μέθοδος που δέχεται μια επιλογή και αναλόγως την επιλογή εκτελεί μια εντολή.
     * @param sc    οπού sc ο Scanner που θα διαβάζει απο το πληκτρολόγιο
     * @param choice    οπού choice είναι ο αριθμός της επιλογές
     * @param nStars    οπού nStars είναι ο αριθμός n αστεράκια
     */
    public static void choiceOptions( Scanner sc, int choice, int nStars ){

        if ( choice < 1 || choice > 6 ){
            System.out.println("Δώσατε λάθος επιλογή. Παρακαλώ ξαναπροσπαθήστε:");
        }

        if ( choice > 0 && choice < 6 ){
            System.out.println("Δώστε αριθμό για αστεράκια");
            nStars = sc.nextInt();
        }

        if ( choice == 1 ) {
            starsHorizontal(nStars);
        }
        else if ( choice == 2 ){
            starsVertical(nStars);
        }
        else if( choice == 3 ){
            starsHV(nStars);
        }
        else  if( choice == 4 ){
            starsLinearGrowth(nStars);
        }
        else if( choice == 5 ){
            starsLinearReduction(nStars);
        }
    }

    /**
     * Μέθοδος που εμφανίζει n αστεράκια οριζόντια
     * @param nStars οπού nStars ο αριθμός n αστεριών
     */
    public static void starsHorizontal(int nStars){
        for ( int i = 0 ; i < nStars ; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    /**
     * Μέθοδος που εμφανίζει n αστεράκια κάθετα
     * @param nStars οπού nStars ο αριθμός n αστεριών
     */
    public static void starsVertical(int nStars){
        for ( int i = 0 ; i < nStars ; i++){
            System.out.println("*");
        }
    }

    /**
     * Μέθοδος που εμφανίζει n γραμμές με n αστεράκια
     * @param nStars οπού nStars ο αριθμός n
     */
    public static void starsHV(int nStars){
        for ( int i = 0 ; i < nStars ; i++){
            starsHorizontal(nStars);
        }
    }

    /**
     * Μέθοδος που εμφανίζει n γραμμές με αστεράκια 1-n
     * @param nStars οπού nStars ο αριθμός n
     */
    public static void starsLinearGrowth(int nStars){
        for ( int i = 1 ; i <= nStars ; i++){
            starsHorizontal(i);
        }
    }

    /**
     * Μέθοδος που εμφανίζει n γραμμές με αστεράκια n-1
     * @param nStars οπού nStars ο αριθμός n
     */
    public static void starsLinearReduction(int nStars){
        for (int i = nStars ; i >= 1 ; i--){
            starsHorizontal(i);
        }
    }

}
