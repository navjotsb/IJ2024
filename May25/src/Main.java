import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }

    public static class Book {
    Scanner scanner = new Scanner(System.in);
        String title;
        String author;
        int price;
        int quantity;

        public Book() {
            System.out.println("Enter the name of the book");
            this.title= scanner.nextLine();


            System.out.println("Enter the name of the author of the book");
            this.author= scanner.nextLine();


            System.out.println("Enter the price of the book");
            this.price=scanner.nextInt();


            System.out.println("Enter the number of book in stock");
            this.quantity= scanner.nextInt();

        }


        void printDetails()
        {
            System.out.print(this.title);
            System.out.print(" by " + this.author);
            System.out.print(" is priced at " + this.price);
            System.out.print(" and has " + this.quantity + " units available in stock");
            System.out.println(" Total price of  " + this.quantity + " is " + price*quantity);
        }

    }
}