package Assignment4thJuly;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
    static String name;
    List<Book> books =new ArrayList<>();;

    public BookStore(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public BookStore(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

   public void addBook (Book book)
   {
       books.add(book);
   }

   public void listBook()
   {
       System.out.println(books.toString());
   }

   public void purchaseBook(String title, int quantity, boolean isMember)
   {
       MemberDiscountClass discount = new MemberDiscountClass();
       for (Book book : books)
       {
           if(book.getTitle().equals(title))
           {
               if (book.getStock() >= quantity)
               {
                   double price = book.getPrice() * quantity;
                   if (isMember) {
                       price = discount.applyDiscount(price);
                   }
                   book.sellBook(quantity);
                   System.out.println("Requested Book " + book.getTitle() + "  is available for $" + price);
               } else {
                   System.out.println("Limited quantity available: " + book.getStock());
               }
               return; // Exit after finding the book
           }
       }
       System.out.println("Book not found: " + title);
   }
}

