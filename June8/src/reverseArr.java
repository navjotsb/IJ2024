import java.util.Scanner;

public class reverseArr {
    public static void main(String[] args) {
        int n;
        System.out.println("enter the length of array");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter input");
            arr[i] = scanner.nextInt();
        }
int j=n-1;
        int[] revarr = new int[n];
        for (int i = 0; i <n ; i++)
        {
                revarr[j]=arr[i];
                j--;
        }
        for (int m = 0; m < n; m++) {
            System.out.println("Reversed arr " + revarr[m]);
        }
    }
}
