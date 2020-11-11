package day25_ArrayIntro;

import java.util.Scanner;

public class MyFriends {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many friends do you have?");
        int number = scan.nextInt();      // because y

        String[]firstName = new String[number];
        String [] lastName = new String[number];

        for(int i = 0; i < number; i++){  //  i: 0, 1, 2, 3....lastIndex
            System.out.println("Enter first Name:");
            String f =  scan.next();
            f = f.substring(0,1).toUpperCase() + f.substring(1).toLowerCase();
            firstName[i] = f;

            System.out.println("Enter last Name: ");
            String l = scan.next();
            l = l.substring(0,1).toUpperCase() + l.substring(1).toLowerCase();
            lastName[i] = l;


        }   // the loop is used for initializing the arrays

        scan.close();

        for(int i = 0; i<number; i++){ // used for printing out the elements in the arrays
            System.out.println(firstName[i] + " " + lastName[i]);
        }


    }
}


/*

how many friends you have?  5,4,3...


String[] firstName = new String [5];
String [] lastName = new String[5];


fullName

 */
