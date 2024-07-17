package July16;

import java.util.Scanner;
import java.util.TreeSet;

public class AlphaSort {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        String names;
        int x =1;

        TreeSet<String> set = new TreeSet<>();

        while( x!=0)
        {
            System.out.println("Enter the name of the students");
            names= scanner.nextLine();
            set.add(names);
            System.out.println("Press any number to continue or 0 to exit ");
            x= scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println(set);
    }
}
