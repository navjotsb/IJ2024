import java.util.Scanner;

public class Array123 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of elements you would like to add");
        int n = scanner.nextInt();
        int array[] = new int[n];
        int num[]= new int[n];
        int k=0;
        int check1=0;
        int check2=0;
        int check3=0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + i + "element");
            array[i]= scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if(array[i]== 1 || array[i]== 2 || array[i]== 3 )
            {
                num[k] = array[i];
                k=k+1;
            }
        }
        for (int i = 0; i < num.length; i++) {
            if(num[i] ==1)
            {
                check1 = 1;
            } else if (num[i] ==2) {
                check2 =1;
            } else if (num[i]==3) {
                check3=1;
            }
        }
        if(check1 ==1 & check2 ==1 & check3 == 1)
        {
            System.out.println("True");

        }
        else{
            System.out.println("False");
        }
    }
}

