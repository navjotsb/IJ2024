import java.util.Scanner;

public class stringMatch {

    public static int stringMatch(String a, String b) {
        int count = 0;
        int len = Math.min(a.length(), b.length());
        for (int i = 0; i < len - 1; i++) {
            if (a.charAt(i) == b.charAt(i) && a.charAt(i + 1) == b.charAt(i + 1)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String a = scanner.nextLine();
        System.out.println("Enter the second string:");
        String b = scanner.nextLine();

        System.out.println(stringMatch(a, b));
        System.out.println("Number of matching substrings: " );

    }
}
