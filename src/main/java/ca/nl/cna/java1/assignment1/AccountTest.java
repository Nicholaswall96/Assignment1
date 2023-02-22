package ca.nl.cna.java1.assignment1;
import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Nick Wall (1)", 25.00);
        Account account2 = new Account("John Wall (2)", 10.50);
        /**
         * Displays initial balance of each account
         */
        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",
                account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);
        /**
         * prompts user and obtains input
         * adds to accounts1 balance, value must be above 0
         */
        System.out.print("Enter deposit amount for account1:");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1's balance",depositAmount);
        account1.deposit(depositAmount);
        /**
         * displays both accounts balances
         */
        System.out.printf("\n%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",
                account2.getName(), account2.getBalance());
        /**
         * prompts user and obtains input
         * adds to accounts2 balance, value must be above 0
         */
        System.out.print("Enter deposit amount for account2:");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2's balance",depositAmount);
        account2.deposit(depositAmount);
        /**
         * displays both account balances
         */
        System.out.printf("\n%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",
                account2.getName(), account2.getBalance());

        /**
         * prompts user and obtains user input
         * withdraws from accounts1 balance, value must be above 0 and lower than balance
         */

        System.out.print("Enter amount to be withdrawn for account1: ");
        double withdrawAmount = input.nextDouble();
        System.out.printf("%nWithdrawing %.2f from accounts1's balance", withdrawAmount);
        account1.withdraw(withdrawAmount);
        /**
         * Displays both account balances
         */
        System.out.printf("\n%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",
                account2.getName(), account2.getBalance());
        /**
         * prompt user and obtains user input
         * withdraws from accounts2 balance, value must be above 0 and lower than balance
         */
        System.out.print("Enter amount to be withdrawn for account2: ");
        withdrawAmount = input.nextDouble();
        System.out.printf("%nWithdrawing %.2f from accounts2's balance", withdrawAmount);
        account2.withdraw(withdrawAmount);
        /**
         * displays both account balances
         */
        System.out.printf("\n%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",
                account2.getName(), account2.getBalance());
    }

}
