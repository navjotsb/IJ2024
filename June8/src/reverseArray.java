import java.util.Scanner;

public class reverseArray {



        public static void main(String[] args) {
            int n;

            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the size of array");
            n= scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i <n ; i++) {
                System.out.println("enter input" );
                arr[i] = scanner.nextInt();

            }

            for (int l = n-1; l >=0; l--) {
                System.out.println(arr[l]);
            }

        }
    }


