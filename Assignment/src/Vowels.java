import java.util.Scanner;

public class Vowels {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        String str = scanner.nextLine();
        int countv=0;
        int countc=0;
        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                countv++;
            }
            else if(str.charAt(i) == ' ')
            {
                continue;
            }
            else
            {
                countc++;
            }


        }
        System.out.println("vowels: " + countv + " consonants: " + countc );
    }
}
