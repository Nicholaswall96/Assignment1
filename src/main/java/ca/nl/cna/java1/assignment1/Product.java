package ca.nl.cna.java1.assignment1;

/**
 * @author 20124982
 * Simple program that shows the id, description, quantity and price of an item
 * and prints it out in an invoice format
 */
public class Product {
    private int id;
    private String description;
    private int quantity;
    private double price;
    /**
     * Constructor that takes the id, description, and price of an item
     * @param id Must be greater than 0
     * @param description description of item
     * @param price Must be greater than 0
     */
    public Product(int id, String description, double price ) {
        if(id > 0){
            this.id = id;
        }
        this.description = description;
        if(price > 0) {
            this.price = price;
        }
    }
    /**
     * Gets the id of the item
     * @return
     */
    public int getId() {
        return this.id;
    }
    /**
     * Sets the id of the item
     * @param id
     */
    public void setId(int id) {
        if(id > 0) {
            this.id = id;
        }
    }
    /**
     * Gets the description of the item
     * @return
     */
    public String getDescription() {
        return this.description;
    }
     /**
     * Sets the description of the item
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the price of the item
     * @return
     */
    public double getPrice() {
        return this.price;
    }
    /**
     * Sets the price of the item
     * @param price
     */
    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        }
    }
    /**
     * Gets the total of all items combined
     * @return
     */
    public double getItemTotal() {
        return this.getPrice() * this.quantity;
    }
}
