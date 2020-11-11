package day22_JavaRecap;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        /*
        scanner object : 1
        min: 1

        "Enter a num" : 5
        scan.nextInt():5
        comparing:5

        "Minimum number is...": 1
         */

        int min = 2147478376;
        // user is most likely to enter a number small than this value


        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a number: ");
            int n = scan.nextInt();   // 100, 200, 50, 300, 40

            if(n < min){
                min = n;
            }




        }
        System.out.println("Minimum number is: " + min);
    }
}