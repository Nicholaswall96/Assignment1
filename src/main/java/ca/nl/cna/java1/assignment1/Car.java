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

    /**
     * Constructor that takes the make, model, year and color of the car
     * @param make
     * @param model
     * @param year
     * @param color
     */
    public Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    /**
     * Gets the make of the car
     * @return
     */
    public String getMake() {
        return make;
    }           //setters and getters

    /**
     * Sets the make of the car
     * @param make
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Gets the model of the car
     * @return
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the model of the car
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Gets the year of the car
     * @return
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the year of the car
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Gets the color of the car
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the car
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }




}