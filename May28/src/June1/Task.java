package June1;

import java.util.Scanner;

public class Task {
    static int perform()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1 for Sum");
        System.out.println("enter 2 for Difference");
        System.out.println("enter 3 for multiplication");
        System.out.println("enter 4 for division");
        System.out.println("enter what task would you like to perform ");
        int task= scanner.nextInt();
        return task;
    }
}
