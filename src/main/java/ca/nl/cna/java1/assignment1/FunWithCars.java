package ca.nl.cna.java1.assignment1;
import java.util.Scanner;

public class FunWithCars {
    public static void main(String[] args) {
        System.out.print("Fun with Cars!");
        Scanner input = new Scanner(System.in);
        /**
         * obtains user input for make and assigns it to a string
         */
        System.out.print("\nEnter the make of the car: ");
        String getMake = input.next();
        /**
         * obtains user input for model and assigns it to a string
         */
        System.out.print("Enter the model of the car: ");
        String getModel = input.next();
        /**
         * obtains user input for year and assigns it to an int
         */
        System.out.print("Enter the year of the car: ");
        Integer getYear = Integer.valueOf(input.next());
        /**
         * obtains user input for color and assigns it to a string
         */
        System.out.print("Enter the color of the car: ");
        String getColor = input.next();
        /**
         * outputs user data
         */
        System.out.printf("Car: %s / %s / %d / %s",getMake, getModel, getYear, getColor);
    }

}
