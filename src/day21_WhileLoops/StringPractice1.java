package day21_WhileLoops;

import java.util.Scanner;

public class StringPractice1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine(); // "java"


        int lastIndex = word.length() - 1;

        char f = word.charAt(0);
        char l = word.charAt(lastIndex);

        System.out.println("" + f + l);
        ///                 106 + 97 = 203


        String r1 = "Batch " + 2 + 1;
//           "Batch 2" + 1
        //         "Batch 21"


        System.out.println("====================================");
        System.out.println("Enter Building Number: ");
        String buildingNumber = scan.next();


        scan.nextLine();

        System.out.println("Enter street name: ");
        String streetName = scan.nextLine();

        System.out.println("Enter apartment number: ");
        int apartmentnumber = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter city name: ");
        String city = scan.nextLine();


        System.out.println("Enter your state: ");
        String state = scan.nextLine();

        System.out.println("Enter your zipcode: ");
        int ZipCode = scan.nextInt();

        String fullAdress = buildingNumber + " " + streetName + " " + apartmentnumber + " " + city + " " + state + " " + ZipCode;
        System.out.println(fullAdress);


        System.out.println("would you like to continue? Yes, No");
        String answer = scan.next().toLowerCase();

        if (answer.equalsIgnoreCase("no")) {

        }


        // String buildingNumber  ( next()  )
        // String street    (nextLine()  )
        // int apartmentNumber  ( nextint()  )
        // String city (  nextLine()  )
        // String state ( nextLine()  )
        // int ZipCode









    }
}
