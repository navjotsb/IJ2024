package Assignment4thJuly;

public class Book {
    String title;
    String author;
    double price;
    int stock;

    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void sellBook(int quantity)
    {
        int change= quantity;
        try {
            if(stock-change<0)
            {
               throw new InsufficientStockException("Product Quantity Can Not be Negative");
            }
            else
            {
                stock = stock - change;
                System.out.println("Updated Stock for " + title + " is " + stock);
            }

        } catch (InsufficientStockException e)
        {
            System.out.println("An error Occurred " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}
