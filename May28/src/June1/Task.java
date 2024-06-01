package June1;

import java.util.Scanner;

public class Task
{
   static Scanner  scanner= new Scanner(System.in);
    static int perform()
    {

        System.out.println("enter 1 for Sum");
        System.out.println("enter 2 for Difference");
        System.out.println("enter 3 for multiplication");
        System.out.println("enter 4 for division");
        System.out.println("enter what task would you like to perform ");
        int task= scanner.nextInt();
        return task;
    }

    public static void add()
    {
        System.out.println("enter two numbers");
        int a = scanner.nextInt();
        int b= scanner.nextInt();
        System.out.println(a+b);
    }

    static void sub()
    {
        System.out.println("enter two numbers");
        int a = scanner.nextInt();
        int b= scanner.nextInt();
        System.out.println(a-b);
    }

    static void multi()
    {
        System.out.println("enter two numbers");
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        System.out.println(a*b);
    }

        static void divide()
        {

            System.out.println("enter 2 nos");
            int a = scanner.nextInt();;
            int b = scanner.nextInt();
            System.out.println(a/b);
        }
        static String conti()
        {
            System.out.println("Do you want to continue?(y/n)");
             String b= scanner.next();
                    return b;

            }
        }

