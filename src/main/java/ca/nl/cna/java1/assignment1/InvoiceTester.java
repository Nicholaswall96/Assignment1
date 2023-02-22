package ca.nl.cna.java1.assignment1;
public class InvoiceTester {
    public static void main(String[] args) {
        System.out.println("\n\t\t\t\t\t\tInvoice details");
        System.out.println(" _______________________________________________________________");
        System.out.print("| ID | Description\t\t|\tPrice    |\tQuantity  |\t\ttotal   |");
        System.out.print("\n _______________________________________________________________");

        Product Oranges = new Product(10, "Oranges\t\t   ", 1.99);
        Product Bananas = new Product(15, "Bananas\t\t   ", 0.59);
        Product Milk = new Product(20, "Cartons of milk ", 4.99);
        Product Coffee = new Product(25, "Bag of coffee   ", 12.99);

        InvoiceItem invoiceItem1 = new InvoiceItem(Oranges, 5);
        InvoiceItem invoiceItem2 = new InvoiceItem(Bananas, 7);
        InvoiceItem invoiceItem3 = new InvoiceItem(Milk, 2);
        InvoiceItem invoiceItem4 = new InvoiceItem(Coffee, 1);

        Invoice invoice = new Invoice();
        invoice.addInvoiceItem(invoiceItem1);
        invoice.addInvoiceItem(invoiceItem2);
        invoice.addInvoiceItem(invoiceItem3);
        invoice.addInvoiceItem(invoiceItem4);

        printInvoice(invoice);
        System.out.println("\n _______________________________________________________________");

        System.out.printf("\n\t\t\t\t\t\t\t\t\t\t  Invoice Total:$",invoice.getInvoiceTotal());
        System.out.println(invoice.getInvoiceTotal());
    }
    public static void printInvoice(Invoice invoice) {
        int numberInvoiceItems = invoice.getNumberItems();
        for (int i = 1; i < numberInvoiceItems; i++) {
            InvoiceItem invoiceItem = invoice.getInvoiceItem(i);
            System.out.printf("\n| %d | %s |\t$%.2f \t |\t %3d \t  |\t\t$%.2f   |",
                    invoiceItem.getProduct().getId(),
                    invoiceItem.getProduct().getDescription(),
                    invoiceItem.getProduct().getPrice(),
                    invoiceItem.getQuantity(),
                    invoiceItem.getItemTotal());

        }
    }

}