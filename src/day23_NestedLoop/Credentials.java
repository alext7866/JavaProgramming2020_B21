package day23_NestedLoop;

/*
    credentials:
    cybertek
    cybertek12345
     */

import java.util.Scanner;

public class Credentials {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username");
        String username = scan.next();

        System.out.println("Enter your password");
        String password = scan.next();

        if (username.equals("cybertek") && password.equals("cybertek12345")) {
            System.out.println("Logged In");
        } else { // condition for invalid username and password
            for (int i = 1; i <= 3; i++) {
                if (i == 3) { //if the attempt is already 3 the account should be lokced
                    System.err.println("your account is locked");
                    System.exit(0);
                }
            }
                System.out.println("Invalid username or password, please re enter");
                System.out.println("Enter your username");
                username = scan.next();

                System.out.println("Enter your password");
                password = scan.next();


                if (username.equals("cybertek") && password.equals("cybertek12345")) {
                    System.out.println("Logged In");

                }
            }
        }
    }
