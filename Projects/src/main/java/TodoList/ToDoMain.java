package TodoList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ToDoMain {

    public static void main(String[] args) {

        List<DoTo> list = new ArrayList<>();

        boolean exit = false;
        int input;

        while (!false) {
            System.out.println("Options: ");
            System.out.println("1. Add Todo");
            System.out.println("2. Delete Todo");
            System.out.println("3. Update Todo");
            System.out.println("4. Mark as Completed");
            System.out.println("5. Exit");
            Scanner scanner = new Scanner(System.in);
            input=scanner.nextInt();
            boolean statusCh;
            switch(input)
            {
            case 1:
                System.out.println("Enter the task to add to the list");
                String taskAdd = scanner.nextLine();
                System.out.println("Press Y if task is completed or any key if not");
                String status = scanner.nextLine();
                if(status.equals("y"))
                {
                     statusCh = true;
                }
                else {
                     statusCh = false;
                }
                list.add(taskAdd,statusCh);


            }
        }
    }
}