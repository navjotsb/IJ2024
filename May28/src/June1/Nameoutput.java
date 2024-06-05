package June1;

import java.util.Scanner;

public class Nameoutput {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("enter your name");
        String name= scanner.nextLine();

        System.out.println("enter your email");
        String email= scanner.nextLine();

        System.out.println("enter your password");
        String password= scanner.nextLine();

        NameInput nameInput= new NameInput();

        NameInput.input(name);

        NameInput.input(name,NameInput.input(email));

        NameInput.input(name,email);

        NameInput.input(name,email,password);
    }
}
