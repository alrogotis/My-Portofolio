package gr.aueb.cf.miniprojects;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Πρόγραμμα Επαφών τηλεφώνου.
 * Δημιουργεί έναν πίνακα 500 χ 3
 * που αντιπροσωπεύουν τις επαφές.
 * Εμφανίζει ενα μενού με επιλογές
 * και αναλόγως την επιλογή,
 * κάνει και την αντίστοιχη πράξη.
 */
public class PhoneContacts {

    //Μεταβλητές προγράμματος
    public static String lastName=" ";
    public static String firstName=" ";
    public static String telephone=" ";

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner sc = new Scanner(System.in);
        String[][] contacts = new String[500][3];
        int menuChoise = 0;
        int rowContact = -1;

        // Γέμισμα πίνακα
        for (String[] row:contacts){
            Arrays.fill(row, " ");
        }

        // Εντολές While
        while ( menuChoise != 5 ){

            System.out.println("ΜΕΝΟΥ ΕΠΑΦΩΝ ΤΗΛΕΦΩΝΟΥ");
            System.out.println();
            System.out.println("1. ΑΝΑΖΗΤΗΣΗ ΕΠΑΦΗΣ");
            System.out.println("2. ΕΙΣΑΓΩΓΗ ΕΠΑΦΗΣ");
            System.out.println("3. ΕΝΗΜΕΡΩΣΗ ΕΠΑΦΗΣ");
            System.out.println("4. ΔΙΑΓΡΑΦΗ ΕΠΑΦΗΣ");
            System.out.println("5. ΕΞΟΔΟΣ");
            System.out.println();
            System.out.println("Δώσε μια επιλογή: ");

            try {

                menuChoise = sc.nextInt();

                while ( menuChoise <= 0 || menuChoise > 5 ){
                    System.out.println("Δώσατε λάθος επιλογή. Παρακαλώ ξαναπροσπαθήστε");
                    menuChoise = sc.nextInt();
                }

                // Επιλογές
                if( menuChoise == 1 ){
                    System.out.println("ΑΝΑΖΗΤΗΣΗ ΕΠΑΦΗΣ");
                    contactResearch(contacts,telephone,sc,rowContact);

                }else if( menuChoise == 2 ){
                    System.out.println("ΕΙΣΑΓΩΓΗ ΕΠΑΦΗΣ");
                    contactInsert(contacts,firstName,lastName,telephone,sc,rowContact);

                }else if( menuChoise == 3 ){
                    System.out.println("ΕΝΗΜΕΡΩΣΗ ΕΠΑΦΗΣ");
                    contactUpdate(contacts,rowContact,sc);

                }else if( menuChoise == 4 ){
                    System.out.println("ΔΙΑΓΡΑΦΗ ΕΠΑΦΗΣ");
                    contactDelete(contacts,rowContact,sc);

                }

            }catch (InputMismatchException e){
                System.out.println("Έδωσες γράμμα  αντί για νούμερο. Παρακαλώ ξαναπροσπαθήστε .");
                sc.nextLine();

            }

        }

        System.out.println("Τερματισμός προγράμματος.");
        sc.close();

    }

    /**
     * Μέθοδος Αναζήτησης επαφής
     *
     * @param contacts      Ο πίνακας επαφών
     * @param telephone     Το τηλέφωνο της επαφής
     * @param sc            Ο Scanner
     * @param rowContact    Η γραμμή στην οποία βρίσκεται η επαφή
     */
    public static void contactResearch(String[][] contacts, String telephone, Scanner sc, int rowContact){

        //Δήλωση και αρχικοποίηση μεταβλητών
        boolean exist = false;
        int choice = 3;

        System.out.println("Δώσε μου τηλέφωνο");
        telephone= sc.next();

        // Αναζήτηση επαφής
        for (int i=0; i< contacts.length; i++){
            if (contacts[i][2].equals(telephone)){
                exist = true;
                rowContact = i;
            }
        }

        // Αποτέλεσμα Αναζήτησης
        if( exist == false){
            System.out.println("Η Επαφή δεν βρέθηκε");
            System.out.println("Ακολουθεί η εισαγωγή της επαφής");
            contactInsert(contacts,firstName,lastName,telephone,sc,rowContact);

        }else {

            System.out.println("Η επαφή βρέθηκε στην θέση: "+rowContact);
            System.out.printf("Επώνυμο: %s - Όνομα: %s - Τηλέφωνο: %s %n", contacts [rowContact][0] , contacts [rowContact][1] , contacts [rowContact][2]);
            System.out.println("Θέλετε Ενημέρωση ή διαγραφή: 0 Οχι, 1 Διαγραφή, 2 Ενημέρωση");

            // Εντολές while
            while ( choice >= 3 || choice < 0 ){
                try {
                    choice = sc.nextInt();

                }catch ( InputMismatchException e ){

                    System.out.println("Έδωσες γράμμα αντί για νούμερο. Παρακαλώ ξαναπροσπάθησε.");
                    sc.nextLine();
                }

            }

            // Εντολές if
            if ( choice == 1 ){
                contactDelete(contacts,rowContact,sc);
            }else if ( choice == 2 ){
                contactUpdate(contacts,rowContact,sc);
            }

        }

    }

    /**
     * Μέθοδος Εισαγωγής Επαφής
     *
     * @param contacts      Ο πίνακας επαφών
     * @param firstName     Όνομα
     * @param lastName      Επώνυμο
     * @param telephone     Τηλέφωνο
     * @param sc            Ο Scanner
     * @param rowContact    Η γραμμή της Επαφής
     */
    public static void contactInsert(String[][] contacts, String firstName, String lastName, String telephone,Scanner sc,int rowContact){

        //Εισαγωγές τιμών
        System.out.println("Δώσε μου Επώνυμο");
        lastName = sc.next();
        System.out.println("Δώσε μου Όνομα");
        firstName = sc.next();
        System.out.println("Δώσε μου τηλέφωνο");
        telephone = sc.next();

        //Τοποθέτηση Επαφής
        for (int i=contacts.length-1; i>=0; i--){
            if (contacts[i][0].equals(" ")){
                rowContact=i;
            }
        }

        if(rowContact < 0){
            System.out.println("Δεν υπάρχει αδεία θέση.");
        }else {
            contacts [rowContact][0] = lastName;
            contacts [rowContact][1] = firstName;
            contacts [rowContact][2] = telephone;
            System.out.println("Η επαφή αποθηκεύτηκε στην θέση: " + rowContact);
            System.out.println();
        }

    }

    /**
     * Μέθοδος Ενημέρωσης Επαφής
     *
     * @param contacts      Πίνακας Επαφών
     * @param rowContact    Γραμμή Επαφής
     * @param sc            Ο Scanner
     */
    public static void contactUpdate(String[][] contacts, int rowContact, Scanner sc){

        int contactChange = 3;

        // Εισαγωγή Γραμμής
        while ( rowContact < 0 ){
            try {
                System.out.println("Δώσε μου την γραμμή της επαφής που θέλεις να αλλάξω. Τιμές 0-499");
                rowContact = sc.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Έδωσες γράμμα αντί για νούμερο. Παρακαλώ ξαναπροσπάθησε.");
                sc.nextLine();
            }
        }

        // Επιλογή Ενημέρωσης
        while ( contactChange >= 3 || contactChange < 0 ) {

            try {
                System.out.println("Τι θέλεις να αλλάξω: 0 για Επώνυμο, 1 για όνομα, 2 για τηλέφωνο");
                contactChange = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Έδωσες γράμμα αντί για νούμερο. Παρακαλώ ξαναπροσπάθησε.");
                sc.nextLine();
            }

        }

        // Αποτέλεσμα επιλογής
        if (contactChange == 0){
            System.out.println("Δώσε μου Επώνυμο");
            lastName=sc.next();
            contacts[rowContact][0]=lastName;
            System.out.println("Το Επώνυμο άλλαξε.");

        }else if (contactChange == 1){
            System.out.println("Δώσε μου Όνομα");
            firstName=sc.next();
            contacts[rowContact][1]=firstName;
            System.out.println("Το Όνομα άλλαξε");
        }else {
            System.out.println("Δώσε μου τηλέφωνο");
            telephone=sc.next();
            contacts[rowContact][2]=telephone;
            System.out.println("Το τηλέφωνο άλλαξε.");
        }

    }

    /**
     * Μέθοδος Διαγραφής Επαφής
     * Αντικαθιστά κάθε στοιχειό της επαφής με το κενό.
     *
     * @param contacts      Πίνακας Επαφών
     * @param rowContact    Η γραμμή της Επαφής
     * @param sc            Ο Scanner
     */
    public static void contactDelete(String[][] contacts, int rowContact, Scanner sc){

        // Επιλογή Επαφής
        while (rowContact < 0 || rowContact > 499){
            try {
                System.out.println("Δώσε μου την γραμμή της επαφής που θέλεις να διαγράψω. Τιμές 0-499");
                rowContact=sc.nextInt();

            }catch (InputMismatchException e){
                System.out.println("Έδωσες γράμμα αντί για νούμερο. Παρακαλώ ξαναπροσπάθησε.");
                sc.nextLine();
            }
        }

        // Αντικατάσταση Στοιχειών Επαφής
        contacts[rowContact][0] = " ";
        contacts[rowContact][1] = " ";
        contacts[rowContact][2] = " ";
        System.out.println("Η επαφή διαγράφηκε.");


    }
}
