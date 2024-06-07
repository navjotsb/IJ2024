import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private double price;
    private int quantity;

    // Constructor to initialize instance variables
    public Book(String title, String author, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to calculate the total price of a given quantity of books
    public static double calculateTotalPrice(double price, int quantity) {
        return price * quantity;
    }

    // Method to display the book details
    public void displayBookDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
        System.out.println("Quantity in stock: " + this.quantity);
        System.out.println("Total price for available stock: " + calculateTotalPrice(this.price, this.quantity));
        System.out.println();
    }
}

public class Bookstore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many books do you want to enter details for? ");
        int numberOfBooks = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        // Array to store multiple Main.Book objects
        Book[] books = new Book[numberOfBooks];

        // Using a for loop to handle input for multiple books
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            // Creating a new Main.Book object and storing it in the array
            books[i] = new Book(title, author, price, quantity);
        }

        // Displaying details of all the books
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println("Details of book " + (i + 1) + ":");
            books[i].displayBookDetails();
        }

        scanner.close();
    }
}
