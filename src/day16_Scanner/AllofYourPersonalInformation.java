package day16_Scanner;


import java.util.Scanner;

public class AllofYourPersonalInformation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int points = 0;


        System.out.println("how many people do you live with");
        byte liveWithNumber = input.nextByte();

        if(liveWithNumber > 0 & liveWithNumber <= 12) {

            if(liveWithNumber <= 2) { // only be 1 or 2
                System.out.println("Live with less than 2 people");
            }else if(liveWithNumber < 7) { // include 3 - 6
                System.out.println("Live with 3-6 people");
            } else { // include 7 - 12
                System.out.println("You live with more than 6 people");
            }


        }else {
            System.err.println("Not a valid number of people");
        }





    }
}
