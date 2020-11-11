package day05_Concatenation;

public class EmployeeInfo_Concatenation {

    public static void main(String[] args) {

        String firstName = "john"; //"" for the texts
        String lastName = "Daniel";
        String fullName = firstName+" "+lastName; // string ==> text
        char gender = 'M'; // '' for single characters
        int age = 35;
        String CompanyName = "CapitolOne";
        String jobTitle = "SDET";
        double salary = 120000;
        boolean isFullTime = true;
        boolean isMarried = false;

        System.out.println("Employee' full name is: "+fullName);
        System.out.println(fullName +"' gender is: "+gender);
        System.out.println(fullName +"' age is: "+age+" years old");
        System.out.println(fullName +" works at "+ CompanyName);
        System.out.println(fullName+"'s job title is: "+jobTitle);
        System.out.println(fullName+"'s salary is: $ "+ salary);




    }
}


/*
declare the following variables:
                    firstName, lastName, gender, age, companyName, jobTitle, isFullTime, isMarried, salary

            write a program that can display the full info of the employee
                    ex:
                             firstName = John
                             lastName = Daniel
                             gender = M
                             age = 35
                             companyName = CapitalOne
                             jobTitle = SDET
                             isFullTime = true
                             isMarried = false
                             salary = 120000.50

             output:
                        Employee' full name is: John Daniel
                        John Daniel' gender is: M
                        John Daniel' age is: 35 years old
                        John Daniel works at: CapitalOne
                        John Daniel' Job title is: SDET
                        John Daniel' salary is 120000.5 $
                        John Daniel is full time employee: true
                        John Daniel is married: false


 */
