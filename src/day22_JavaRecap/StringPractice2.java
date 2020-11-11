package day22_JavaRecap;

import java.util.Scanner;

public class StringPractice2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = scan.nextLine().toUpperCase();

        System.out.println("Enter your last name: ");
        String lastName = scan.nextLine().toUpperCase();

        scan.close();

       String initial = firstName.substring(0,1).toUpperCase() + lastName.substring(0,1).toUpperCase();


        System.out.println("initial = " + initial);

    }
}
