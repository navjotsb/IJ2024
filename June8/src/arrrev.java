import java.util.Scanner;

public class arrrev {

    public static void main(String[] args) {
        System.out.println("enter the no of elements");
        int n;
        Scanner scanner = new Scanner(System.in);
        n= scanner.nextInt();
        int [] arr = new int[n];
        int [] rev = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= scanner.nextInt();
        }
        for (int j = 0; j < arr.length; j++) {
            rev[n-1-j] = arr[j];

        }
         for (int k = 0; k < rev.length; k++) {
             System.out.println("reversed error" + rev[k]);
         }
        for (int m = rev.length-1; m >= 0; m--) {
            System.out.println("actual error " + arr[m]);
        }

        }
    }