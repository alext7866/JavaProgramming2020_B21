package day19_ForLoop;

import java.util.Scanner;

public class CombinedToString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s1= scan.next();
        String s2 = scan.next();

        scan.close();

        if(s1.charAt(s1.length()-1) == s2.charAt(0) ){  // if last character of first
            System.out.println(s1+s2.substring(1));
        }else {
            System.out.println(s1+s2);
        }

        System.out.println("=====================");

        if(s1.endsWith( s2.substring(0,1) ) ){        // if the first string ends with the first character
            System.out.println(s1 + s2.substring(1));
        }else{
            System.out.println(s1+s2);
        }


    }
}




/*
 4. Ask user to enter two words. Then add them together and print. But if the last letter if the first word and the first letter of the last letter is the same, print that character once.
                    Input:
                        one
                        eight
                    Output:
                        oneight

 */