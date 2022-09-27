package gr.aueb.cf.chapter10;

import java.util.Scanner;

/**
 * Ορίζει μια κλάση Account με Business Logic
 */
public class Account {

    //Μεταβλητές
    private long id;
    private String iban;
    private String lastname;
    private String firstname;
    private String ssn;
    private double balance;
    private double payment;
    private double dosi;

    // Επιστροφή ενός instance του account.
    public static  Account getInstance(){
       return  new Account();
    }

    // Constructors
    private Account() {}

    public Account(long id, String iban, String lastname, String firstname, String ssn, double balance, double payment, double dosi) {
        this.id = id;
        this.iban = iban;
        this.lastname = lastname;
        this.firstname = firstname;
        this.ssn = ssn;
        this.balance = balance;
        this.payment = payment;
        this.dosi = dosi;
    }

    // Getters / Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public double getDosi() {
        return dosi;
    }

    public void setDosi(double dosi) {
        this.dosi = dosi;
    }


    // Business Logic

    /**
     * Deposits an amount to this account
     *
     * @param amount    the amount of money to deposit
     */
    public boolean deposit(double amount){
        if (amount > 0){
            balance += amount;
            return true;

        }else {
            return false;
            // do something
        }
    }

    /**
     * withdraws a certain amount of money from the account.
     *
     * @param amount    the amount of money to withdraw
     */
    public boolean withdraw(double amount){
        if (amount <= balance){
            balance -= amount;
            return true;
        }else {
            payment += OverfraftAccount.overfraftPayment(amount , balance);
            dosi = OverfraftAccount.overfraftDose(payment);
            return false;
        }
    }

    /**
     * Gets the balance amount of money
     *
     * @return  the balance
     */
    public double getAcoountBalsnce(){
        return getBalance();

    }

    /**
     * Gets the state of account instance
     *
     * @return  the account state transformed to string
     */
    public String getAccountState() {

        return "id: " + id + "\t" + "iban: " + iban + "\t" + "lastname: " + lastname + "\t" + "firstname: " + firstname + "\t" + "ssn: " + ssn + "\t" + "balance: " + balance;

    }

    /**
     * prints the account state
     */
    public void  printAccountState(){

        System.out.println("id: " + id + "\t" + "iban: " + iban + "\t" + "lastname: " + lastname + "\t" + "firstname: " + firstname + "\t" + "ssn: " + ssn + "\t" + "balance: " + balance);

    }



}
