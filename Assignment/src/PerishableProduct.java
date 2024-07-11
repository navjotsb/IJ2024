public class PerishableProduct extends Product{

    private String expireDate;

    public PerishableProduct(String id, String productname, double price, int quantity, String expireDate) {
        super(id, productname, price, quantity);
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }
}
