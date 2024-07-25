package Assignment4thJuly;

public class BookMain {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore("Nav Books");
        bookStore.addBook(new Book("Book One", "Author One", 29.99, 10));
        bookStore.addBook(new Book("Book Two", "Author Two", 19.99, 5));

        bookStore.purchaseBook("Book One", 1, true);



    }
}
