

import java.util.Scanner;

public class Arrays {
    // Collection of similar type of data
    //Homogeneous
    public static void main(String[] args) {
        int id[] = new int[3];
        // dataType[] variable;
        String [] name =  new String[3];
        Scanner scanner = new Scanner(System.in);
        for(int i =0;i<id.length;i++)
        {
            System.out.println("enter no");
       id[i]= scanner.nextInt();
            scanner.nextLine();
            System.out.println(id[i]);
            System.out.println("enter name");
            name[i] = scanner.nextLine();
            System.out.println(name[i]);
        }
    }


}
