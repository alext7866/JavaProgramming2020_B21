package day20_ForLoop;

import java.util.Scanner;

public class SumOfUserEnteredNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
      /*
        System.out.println("Enter a number");
        int n1 = scan.nextInt();

        System.out.println("Enter a number");
        int n2 = scan.nextInt();

        System.out.println("Enter a number");
        int n3 = scan.nextInt();

        System.out.println("Enter a number");
        int n4 = scan.nextInt();

        System.out.println("Enter a number");
        int n5 = scan.nextInt();

        int result = n1 + n2 + n3 + n4 + n5;

        System.out.println("Sum: "+result);
        */



         int result = 0; // to contain the sum of each user entered numbered
        for(int i = 1; i <= 5; i++){  // we allowed the user to decide how many number he wants to enter
            System.out.println("Enter a number: ");
           result += scan.nextInt(); // each user input will be added to result
        }

        System.out.println("result = " + result);
    }
}


/*
3. write a program that can calculate the sum of 5 user entered input
 */