package ca.nl.cna.java1.assignment1;
import java.util.Scanner;

public class FunWithCars {
    public static void main(String[] args) {
        System.out.print("Fun with Cars!");         //Title
        Scanner input = new Scanner(System.in);     //Allows user input

        System.out.print("\nEnter the make of the car: ");      //gets make of car
        String getMake = input.next();

        System.out.print("Enter the model of the car: ");       //gets model of car
        String getModel = input.next();

        System.out.print("Enter the year of the car: ");      // gets year of car
        Integer getYear = Integer.valueOf(input.next());        // ask about this line

        System.out.print("Enter the color of the car: ");       //gets color of car
        String getColor = input.next();

        System.out.printf("Car: %s / %s / %d / %s",getMake, getModel, getYear, getColor);
    }

}
