import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        String str;
        String str1 = "";
        Scanner scanner = new Scanner(System.in);
        str= scanner.nextLine();
        int length= str.length();

        for (int i = length-1; i >=0; i--) {
            str1 += str.charAt(i);

        }
        if(str.equals(str1))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }
    }

}
