import java.util.Scanner;

public class Strrev {
    static String str1;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count=0;
        int temp=0;

        System.out.println(str.indexOf(" "));

        while(str.indexOf(" ")>=0)
        {
            for ( int j = 0; j < str.length(); j++) {

                if(str.charAt(j) == ' ')
                {
                    count=j;
                    if(count>= temp)
                    {
                        temp=count;
                         str1= str.substring(0,j);
                    }
                    str = str.substring(j+1);
                }
            }

        }
        System.out.println(str1);
    }
}
