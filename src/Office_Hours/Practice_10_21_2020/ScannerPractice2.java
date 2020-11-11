package Office_Hours.Practice_10_21_2020;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Enter
        System.out.println("Enter a price");
        double price = scan.nextDouble(); // 90 Enter

        System.out.println("price: " + price );

        System.out.println("Enter the name of the item");
        String item = scan.next(); // duck

        System.out.println("Item: " + item);

        scan.nextLine();

        System.out.println("enter the name of dog: ");
        String dog = scan.nextLine(); // Yosan Bob

        System.out.println("full Name: " + dog);





    }
}
