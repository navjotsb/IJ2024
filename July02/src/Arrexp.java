public class Arrexp {
    public static void main(String[] args) {
int n=5;
int [] arr = new int[n];
try
{

    arr =  new int[]{1, 2, 3, 4, 5, 6};
    for (int i = 0; i <= arr.length; i++) {
        System.out.println(arr[i]);
    }
}catch (ArrayIndexOutOfBoundsException e)
{
   // System.out.println(e);
  // e.printStackTrace();
}
        System.out.println("checking test line");

    }
}
