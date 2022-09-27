package gr.aueb.cf.chapter10;

import java.io.FileNotFoundException;

public class BankApp {

    public static void main(String[] args) throws FileNotFoundException {

        Account demo = new Account(11,"234967098","Παπαδόπουλος", "Σωτήρης","Χ 234560",500,0,0);

        if (demo.withdraw(1000)){
            System.out.println("Επιτυχής ανάληψη");
        }else {
            System.out.println("Μη επαρκές υπόλοιπο.");
            System.out.println("Μόλις χρεωθήκατε " + demo.getPayment());
            System.out.format("Θα πρέπει να το αποπληρώσετε σε 12 δόσεις των %.2f  η κάθε μια", demo.getDosi());
        }

    }


}
