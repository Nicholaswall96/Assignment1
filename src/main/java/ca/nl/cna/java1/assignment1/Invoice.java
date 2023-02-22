package ca.nl.cna.java1.assignment1;

/**
 * @author 20124982
 * Class called invoice with 3 attributes
 * MAX_INVOICE_ITEMS, invoiceItemArray, and NumberItems
 */
public class Invoice {

    public static final int MAX_INVOICE_ITEMS = 5;
    private InvoiceItem[] invoiceItemArray;
    private int numberItems;

    /**
     * Empty invoice with no invoice items
     */
    public Invoice() {
        numberItems = 1;
        invoiceItemArray = new InvoiceItem[MAX_INVOICE_ITEMS];
    }

    /**
     * If numberItems < MAX_INVOICE_ITEMS then invoice is added
     * if numberItems > MAX_INVOICE_ITEMS nothing is added and nothing happens
     * @param invoiceItem
     */
    public void addInvoiceItem(InvoiceItem invoiceItem){
        if(numberItems<MAX_INVOICE_ITEMS){
            invoiceItemArray[numberItems] = invoiceItem;
            numberItems++;
        }
    }

    /**
     * Gets invoice item at position counting from 1-5
     * @param lineNumber
     * @return
     */
    public InvoiceItem getInvoiceItem(int lineNumber){
        return invoiceItemArray[lineNumber];
    }

    /**
     * Gets the number of line items on invoice
     * @return number of lines on invoice
     */
    public int getNumberItems()
    {
        return numberItems;
    }

    /**
     * gets the total of the invoice
     * @return total
     */
    public double getInvoiceTotal(){
        double total = 0;
        for (int i = 1; i < this.getNumberItems(); i++) {
            total += invoiceItemArray[i].getItemTotal();
        }
        return total;
    }
}