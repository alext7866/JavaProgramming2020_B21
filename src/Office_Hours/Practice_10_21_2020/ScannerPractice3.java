package Office_Hours.Practice_10_21_2020;


import java.util.Scanner;

public class ScannerPractice3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your gender ");
        String gender = scan.next();

        System.out.println("gender: " + gender);

        System.out.println("Enter your age");
        int age = scan.nextInt();

        System.out.println("age: " + age);

       scan.nextLine();

        System.out.println("Enter your full name");
        String fullname = scan.nextLine();

        System.out.println("full name: " + fullname);

        System.out.println("Enter you Zip code");
        int Zipcode = scan.nextInt();

        System.out.println("Zip code: " + Zipcode);

         scan.nextLine();

        System.out.println("Enter your country Name");
        String Countryname = scan.nextLine();

        System.out.println("Country Name: " + Countryname);

        System.out.println("Enter your Salary");
        double Salary = scan.nextDouble();

        System.out.println("Salary: " + Salary);

        scan.nextLine();

        System.out.println("Enter Company Name");
        String Company = scan.nextLine();

        System.out.println("Company: " + Company);


        System.out.println("Enter the address");
        String Address = scan.nextLine();

        System.out.println("Address: " + Address);



    }
}



/*
1. ask gender ( next() )
2. ask age (nextInt()  )
3. ask full name (nextLine()  )
4. ask zip code ( nextInt()  )
5. ask Country name ( nextLine() )
6. ask Salary ( nextDouble()  )
7. ask company name ( nextLine() )
 */
