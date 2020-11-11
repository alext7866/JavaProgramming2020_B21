package day20_ForLoop;

import java.util.Scanner;

public class BreakContinue {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i--) {  // i: 1, 0
            if (i < 1) {
                break;  // exits the loop immedietly
            }
            System.out.println("Hello Batch 21");


        }
        System.out.println("=========================");
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i == 0; ) {

            System.out.println("Enter two numbers: ");
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();
            System.out.println("Sum is: " + (n1 + n2));
            System.out.println("WOULD you like to continue? Yes, No");
            String answer = scan.next();

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using our calculator");
                break;
            }


        }

    }


      /*
        System.out.println("Enter two numbers: ");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        System.out.println("Sum is: " + (n1+n2) );
        System.out.println("WOULD you like to continue? Yes, No");
        String answer = scan.next();
*/


    }

 /*
 ask user to enter two numbers and then print the sum of those two numbers
 ask the user, would you like to continue? yes, No
         if answer is yes --> repeat
         if answer is No --> exit the loop
  */