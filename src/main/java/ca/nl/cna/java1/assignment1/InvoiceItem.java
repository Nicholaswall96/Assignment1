package ca.nl.cna.java1.assignment1;

/**
 * @author 20124982
 * Class called invoiceItem with two attributes
 * Constructor, getter and setter
 * getItemTotal() which finds total with quantity * price
 */
public class InvoiceItem {
    private Product product;
    private int quantity;

    /**
     * Constructor that takes product and quantity
     * @param product
     * @param quantity
     */
    public InvoiceItem(Product product, int quantity){
        this.product = product;
        if(quantity > 0) {
            this.quantity = quantity;

        }
    }

    /**
     * gets the product
     * @return
     */
    public Product getProduct(){
        return this.product;
    }

    /**
     * Sets the product
     * @param product
     */
    public void setProduct(Product product){
        this.product = product;
    }

    /**
     * Gets the quantity
     * @return
     */
    public int getQuantity() {
        return this.quantity;
    }

    /**
     * Sets the quantity
     * @param quantity
     */
    public void setQuantity(int quantity) {
        if(quantity > 0) {
            this.quantity = quantity;
        }
    }
    /**
     * Gets item total based on price * quantity
     * @return item total
     */
    public double getItemTotal() {
        return this.getProduct().getPrice() * this.quantity;
    }
}
