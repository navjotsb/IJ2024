import java.util.Scanner;

public class addArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr1= new int[3][3];
        int[][] arr2= new int[3][3];
        int[][] arr3= new int[3][3];
        System.out.println("enter arr1");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < 3 ; j++) {
                arr1[i][j]= scanner.nextInt();
            }
        }
        System.out.println("enter arr 2");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < 3 ; j++) {
                arr2[i][j]= scanner.nextInt();
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < 3 ; j++) {
             arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("sum of 2 arrays");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < 3 ; j++) {
                System.out.println("arr out" + arr3[i][j]);
            }
        }


    }
}
