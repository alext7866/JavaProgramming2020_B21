package day15_Scanner;

import java.util.Scanner;

public class Scanner_Decimal {

    public static void main(String[] args) {

        Scanner Decimal = new Scanner(System.in);

        System.out.println("Enter a float number");
        float floatNumber = Decimal.nextFloat();
        System.out.println("Number is: " + floatNumber);

        System.out.println("Enter a double number");
        double doubleNumber = Decimal.nextDouble();
        System.out.println("Number is: " + doubleNumber);

        System.out.println(Decimal.nextFloat() + Decimal.nextDouble());
    }

}
