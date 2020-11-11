package day8_ShortHand_Relational;

public class IdentifyNumber {

    public static void main(String[] args) {
        int number = -100;
        boolean isPositive = number > 0; // if number is greater than zero then it is positive
        boolean isNegative = number < 0; //if number is less than zero then it is negative
        boolean isZero = number == 0; // if number is equal to zero, then it's zero

        System.out.println(number+" is positive number: "+ isPositive);
        System.out.println(number+" is negative number: "+ isNegative);
        System.out.println(number+" is zero: "+ isZero);

        float    a   =  100.987_6543f;

        short  b  =  (byte) a ;

        byte  c   = (byte) b;

        System.out.println(c);


    }




}


/*
    number = 200

    output:
        200 is positive number: true
        200 is negative number: false
        200 is zero: false


 */


