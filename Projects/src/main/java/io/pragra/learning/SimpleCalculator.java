package io.pragra.learning;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

import static io.pragra.learning.Iadd.sleep;

public class SimpleCalculator {

    public static void main(String[] args) {

        System.out.println("Please Enter your name");
        Scanner scanner = new Scanner(System.in);
        String name= scanner.nextLine();
        boolean exit=false;
        System.out.println("Hi " + name + ", My name is Smart Calc ");
        while(!exit) {
            System.out.println("Press 1 for Addition");
            System.out.println("Press 2 for Subtraction");
            System.out.println("Press 3 for Multiplication");
            System.out.println("Press 4 for Divison");
            System.out.println("Press 5 for exit");
            System.out.println("What operation would you like to use");
            int input = scanner.nextInt();
            Double a;
            Double b;
            switch (input) {
                case 1:
                    BiFunction<Double, Double, Double> addFunction = (num1, num2) -> num1 + num2;
                    System.out.println("Enter the first input");
                    a = scanner.nextDouble();
                    System.out.println("Enter the second input");
                    b = scanner.nextDouble();
                    System.out.println(addFunction.apply(a, b));
                    sleep(2000);
                    break;


                case 2:
                    BiFunction<Double, Double, Double> subFunction = (num1, num2) -> num1 - num2;
                    System.out.println("Enter the first input");
                    a = scanner.nextDouble();
                    System.out.println("Enter the second input");
                    b = scanner.nextDouble();
                    System.out.println(subFunction.apply(a, b));
                    sleep(2000);
                    break;

                case 3:
                    BiFunction<Double, Double, Double> multiFunction = (num1, num2) -> num1 * num2;
                    System.out.println("Enter the first input");
                    a = scanner.nextDouble();
                    System.out.println("Enter the second input");
                    b = scanner.nextDouble();
                    System.out.println(multiFunction.apply(a, b));
                    sleep(2000);
                    break;
                case 4:
                    BiFunction<Double, Double, Double> divFunction = (num1, num2) -> num1 / num2;
                    System.out.println("Enter the first input");
                    a = scanner.nextDouble();
                    System.out.println("Enter the second input");
                    b = scanner.nextDouble();
                    System.out.println(divFunction.apply(a, b));
                    sleep(2000);
                    break;

                case 5:
                    System.out.println("System is existing");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid input, Please enter the correct input");
                    sleep(2000);

            }
        }








      /*  Iadd iadd = (num1, num2) -> num1+num2;
       Double result= iadd.add(10.0,20.2);
        System.out.println(result);
*/


    }
}
