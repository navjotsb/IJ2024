public class Product {
    private String id;
    private String productName;
    private double price;
    private int quantity;

// Constructor

    public Product(String id, String productname, double price, int quantity) {
        this.id = id;
        this.productName = productname;
        this.price = price;
        this.quantity = quantity;
    }

// Getter

    public String getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setter

    public void setId(String id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //toString

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", product name='" + productName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
