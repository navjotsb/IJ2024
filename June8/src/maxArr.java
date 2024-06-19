import java.util.Scanner;

public class maxArr {
    static int n;
    public static void main(String[] args) {

        System.out.println("enter the size of array");
        Scanner scanner =new Scanner(System.in);
        n=scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter an element");
            arr[i]=scanner.nextInt();
        }
        int high=maxArr(arr);
        System.out.println("Highest number is " + high);
    }
    public static int maxArr(int [] arr)
    {
         int highest=arr[0];
        for (int j = 0; j < arr.length-1  ; j++) {
            if(highest>=arr[j+1])
            {
                System.out.println("check highest" + highest);
                continue;
            }
            else {
                highest=arr[j+1];
                System.out.println("check highest" + highest);
            }

        }
        return highest;

    }
}


