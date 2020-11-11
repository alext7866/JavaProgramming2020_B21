package day8_ShortHand_Relational;

public class GallonsToLiters {

    public static void main(String[] args) {
        int gallons = 100;
        double liters = gallons * 3.785;
        int result = (int) liters;


        System.out.println(gallons +" gallons equal to  "+ result +" liters");


        System.out.println(gallons + " gallons equal to "+(int)(gallons * 3.785) +" liters");

    }
}
