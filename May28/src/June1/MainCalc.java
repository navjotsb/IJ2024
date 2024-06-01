package June1;

import java.util.Scanner;

public class MainCalc {
    public static void main(String[] args) {
      String x;
        do {
       Task task= new Task();
       int input=Task.perform();
        switch (input)
        {
            case 1:
            {
                Task.add();
                break;
            }
            case 2:
            {
                Task.sub();
                break;
            }
            case 3:
            {
                Task.multi();
                break;
            }
            case 4:
            {
                Task.divide();
                break;
            }

        }
       x =Task.conti();
            System.out.println(x);

    } while(x.equalsIgnoreCase("y"));
    }
}

