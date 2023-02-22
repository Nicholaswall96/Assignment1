package ca.nl.cna.java1.assignment1;

/**
 * @author 20124982
 * Simple Progrom for bank accounts
 * Able to show, withdraw and deposit funds as long as its above 0
 * @@@ ASK ABOUT RESET METHOD
 */

/**
 * Class that initializes variables
 */
public class Account {
    private String name;
    private double balance;
    /**
     * Constructor that takes name and balance, assigns it, makes sure
     * it's greater than 0 and updates it
     * @param name
     * @param balance
     */
    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0.0) {
            this.balance = balance;
        }
    }
    /**
     *constructor that only deposits if amount > 0. Else error msg
     * @param depositAmount
     */
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance = balance + depositAmount;
        } else {
            System.out.print("\nCannot add negative money");
        }
    }
    /**
     *Constructor that only withdraws if amount < balance. Else error msg
     * @param withdrawAmount
     */
    public void withdraw(double withdrawAmount) {
        if (withdrawAmount < balance) {
            balance = balance - withdrawAmount;
        } else {
            System.out.print("\nDebit amount exceeded account balance");
        }
        if (withdrawAmount < 0) {
            balance +=  withdrawAmount;
            System.out.print("\nCannot withdraw negative money");

        }
    }
    /**
     * Gets the balance
     * @return
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Sets account name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets account name
     * @return
     */
    public String getName() {
        return name;
    }
}
