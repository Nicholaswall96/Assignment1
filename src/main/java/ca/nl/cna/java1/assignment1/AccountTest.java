package ca.nl.cna.java1.assignment1;
import java.util.Scanner;
public class AccountTest {                                          //inputting and outputting floating-point numbers with account objects
    public static void main(String[] args) {
        Account account1 = new Account("Nick Wall (1)", 25.00);
        Account account2 = new Account("John Wall (2)", 10.50);

        System.out.printf("%s balance: $%.2f%n",                    //display initial balance of each object
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",
                account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);                     //create a scanner to contain input from the command window

        System.out.print("Enter deposit amount for account1:");     //prompt
        double depositAmount = input.nextDouble();                  //obtain user input
        System.out.printf("%nadding %.2f to account1's balance",depositAmount);     //add to accounts1's balance
        account1.deposit(depositAmount);

        System.out.printf("\n%s balance: $%.2f%n",                    //display balances
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",
                account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2:");     //prompt
        depositAmount = input.nextDouble();                  //obtain user input
        System.out.printf("%nadding %.2f to account2's balance",depositAmount);     //add to accounts2's balance
        account2.deposit(depositAmount);

        System.out.printf("\n%s balance: $%.2f%n",                    //display balances
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",
                account2.getName(), account2.getBalance());

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.print("Enter amount to be withdrawn for account1: ");        //prompt
        double withdrawAmount = input.nextDouble();                             //obtain user input
        System.out.printf("%nWithdrawing %.2f from accounts1's balance", withdrawAmount);  //withdraw from accounts1 balance
        account1.withdraw(withdrawAmount);

        System.out.printf("\n%s balance: $%.2f%n",                    //display balances
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",
                account2.getName(), account2.getBalance());

        System.out.print("Enter amount to be withdrawn for account2: ");        //prompt
        withdrawAmount = input.nextDouble();                             //obtain user input
        System.out.printf("%nWithdrawing %.2f from accounts2's balance", withdrawAmount);  //withdraw from accounts2 balance
        account2.withdraw(withdrawAmount);

        System.out.printf("\n%s balance: $%.2f%n",                    //display balances
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",
                account2.getName(), account2.getBalance());
    }

}
