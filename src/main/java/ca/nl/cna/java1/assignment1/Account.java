package ca.nl.cna.java1.assignment1;

public class Account {
    private String name; //instance variable
    private double balance; // instance variable

    public Account(String name, double balance) {   //Account constructor that receives two parameters
        this.name = name;                           //assign name to instance variable anem
        if (balance > 0.0) {                        //validate that the balance is greater than 0.0; if not,
            this.balance = balance;                 //instance variable balance keeps it default initial value of 0.0
        }



    }

    public void deposit(double depositAmount) {     //method that deposits (adds) only a valid amount to the balance
        if (depositAmount > 0.0) {                  // if the depositAmount is valid
            balance = balance + depositAmount;      // add it to the balance
        }
        else {
            System.out.print("\nCannot add negative money");      // if deposited amount is less than 0
        }
    }
    public void withdraw(double withdrawAmount) {   //method that withdraws (subtracts) only a valid amount to the balance
        if (withdrawAmount < balance) {             //if withdrawing(subtracting) is less than current balance
            balance = balance - withdrawAmount;     //subtracts it from balance
        }
        else {
            System.out.print("\nDebit amount exceeded account balance");      //if withdraw is higher than balance this prompts
        }
    }

    public double getBalance() {                    //method returns the account balance
        return balance;
    }
    public void setName(String name) {              //method that sets the name
        this.name = name;
    }

    public String getName() {                       //method that returns the name
        return name;
    }
}
