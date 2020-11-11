package day16_Scanner;

import java.util.Scanner;

public class task9_Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);   // make the scanner object

        System.out.println("Enter number one");
        double numberOne = input.nextDouble();  // accepting the first number

        System.out.println("Enter number two");
        double numberTwo = input.nextDouble();  // accepting the second number

        System.out.println("Enter the operator");
        String operator = input.next();     // accepting the operation

        input.close();   // closing the scanner because we have all the inputs

        double result = 0;
        boolean isValid = true;

        switch(operator){

            case "+":
                result = numberOne + numberTwo;
                break;
            case "-":
                result = numberOne - numberTwo;
                break;
            case "*":
                result = numberOne * numberTwo;
                break;
            case "/":
                result = numberOne / numberTwo;
                break;
            case "%":
            result= numberOne % numberTwo;
            break;
            default:
                System.out.println(operator + "is invalid");
                isValid = false;

        }

        if(isValid){
            System.out.println(numberOne + operator + numberTwo + " = " + result);

        }


    }
}
