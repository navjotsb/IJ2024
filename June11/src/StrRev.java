import java.util.Scanner;

public class StrRev {
    private static String Str;

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter a string");
        String name = scanner.nextLine();

        int l= name.length();
        char[] reverse = new char[l];
        for (int i = 0; i < l; i++) {
         reverse[i]= name.charAt(l-1-i);

        }
        System.out.println(reverse);
    }
}
