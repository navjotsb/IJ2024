


import java.util.Scanner;

public class BookMain {
    static int i=0;
    public static void main(String[] args) {
        System.out.println("how many books do we have");
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();

        do{
            Book book = new Book();

            book.printDetails();
            i++;
        } while (i<n);


    }
}
