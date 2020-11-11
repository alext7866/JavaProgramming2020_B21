package day16_Scanner;

import java.util.Scanner;

public class Scanner_Next {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Enter your last name");
        String lasName = input.next();

        System.out.println("Full name is: " + firstName +" " + lasName);

    }
}
