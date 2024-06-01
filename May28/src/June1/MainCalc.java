package June1;

import java.util.Scanner;

public class MainCalc {
    public static void main(String[] args) {

       Task task= new Task();
       int input=Task.perform();
        switch (input)
        {
            case 1:
            {
                Sum sum= new Sum();
                Sum.add();
                break;
            }
            case 2:
            {
                Differnece differnece=new Differnece();
                Differnece.sub();
                break;
            }
            case 3:
            {
                Multiplication multiplication = new Multiplication();
                Multiplication.multi();
                break;
            }
            case 4:
            {
                Divison divison= new Divison();
                Divison.divide();
                break;
            }

        }
    }
}
