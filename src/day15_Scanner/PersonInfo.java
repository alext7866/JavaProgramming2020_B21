package day15_Scanner;

import java.util.Scanner;

public class PersonInfo {

    public static void main(String[] args) {

        Scanner info = new Scanner(System.in);

        System.out.println("Please enter your age");
        byte age = info.nextByte();

        System.out.println("please enter your favorite number");
        long favNum = info.nextLong();

        System.out.println("are you a student? enter true or false");
        boolean isStudent = info.nextBoolean();

        System.out.println("age: " + age);
        System.out.println("favorite number: " + favNum);
        System.out.println("Is a Student: " + isStudent);

        if(isStudent){
            System.out.println("Great, you are a student!");
        }else {
            System.out.println("Oh Okay, you are not a student");
        }


    }
}
