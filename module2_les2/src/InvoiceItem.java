import java.util.UUID;

public class InvoiceItem {
    private UUID id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String desc, int qty, double unitPrice) {
        this.id = UUID.randomUUID();
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public UUID getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return unitPrice * qty;
    }

    @Override
    public String toString() {
        return "InvoiceItem" + "\n" +
                "ID: " + id + "\n" +
                "Description: " + desc + "\n" +
                "Quantity: " + qty + "\n" +
                "Unit Price: " + unitPrice + "\n" +
                "Total: " + getTotal();
    }

    public static void main(String[] args) {
        InvoiceItem invoiceItem1 = new InvoiceItem("Книга", 5, 500);
        System.out.println(invoiceItem1.toString());
    }
}
