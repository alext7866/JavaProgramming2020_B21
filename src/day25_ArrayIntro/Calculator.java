package day25_ArrayIntro;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your first number: ");
            double n1 = scan.nextDouble();
            System.out.println("Math Operator: ");
            char o = scan.next().charAt(0);
            System.out.println("Enter your second number: ");
            double n2 = scan.nextDouble();

            switch (o) {
                case '+':
                    System.out.println("Addition: " + (n1 + n2));
                    break;
                case '-':
                    System.out.println("Subtraction: " + (n1 - n2));
                    break;
                case '*':
                    System.out.println("Multiplication: " + (n1 * n2));
                    break;
                case '/':
                    System.out.println("Division: " + (n1 / n2));
                    break;
                default:
                    System.out.println("Invalid");

            } // calculates the result


            System.out.println("would you like to continue?");
            String a = scan.next().toLowerCase();

            while(  !(a.equals("yes")   ||   a.equals("no"))  ){ // while answer is not valid
                System.out.println("invalid answer, please re-enter");
                System.out.println("would you like to continue?");
                a = scan.next().toLowerCase();
            }

            if(a.equals("no")) {
                break;
            }
        }

        scan.close();

    }
}
