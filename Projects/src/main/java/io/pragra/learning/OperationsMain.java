package io.pragra.learning;

import java.util.HashMap;
import java.util.Scanner;

public class OperationsMain {

    public static void main(String[] args) {
        OperationMethod operationMethod = new OperationMethod();
        HashMap<Integer,IOperations> op = new HashMap<>();
        op.put(1,(a,b) -> a + b);
        op.put(2,(a,b) -> a - b);
        op.put(3,(a,b) -> a * b);
        op.put(4,(a,b) -> a/b);
        boolean exit = false;
        Scanner scanner=new Scanner(System.in);
        Double num;
        Double num1;
        while(!exit)
        {
            System.out.println("Press 1 for Addition");
            System.out.println("Press 2 for Subtraction");
            System.out.println("Press 3 for Multiplication");
            System.out.println("Press 4 for Division");
            System.out.println("Press 5 for exit");
            System.out.println("Which operation would you like to use?");
            int input = scanner.nextInt();

            if (input == 5) {
                System.out.println("System is exiting...");
                exit = true;
            } else if (op.containsKey(input)) {
                System.out.println("Enter input No 1 ");
                num= scanner.nextDouble();
                System.out.println("Enter input No 2 ");
                num1= scanner.nextDouble();
                operationMethod.operationMethod(num,num1,op.get(input));
                } else {
                System.out.println("Please enter a Valid input");
            }
                
            }

        }
}
