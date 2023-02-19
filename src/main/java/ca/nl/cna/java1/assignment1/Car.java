package ca.nl.cna.java1.assignment1;

/**
 * Simple program that shows the make, model, year and color of a car
 * @author 20124982
 */

public class Car {
    private String make;
    private String model;
    private int year;
    private String color;

    public Car(String make, String model, int year, String color) {  //Constructor to initialize objects
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getMake() {               //setters and getters to return and set values
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }




}