package day21_WhileLoops;

public class SubStringMethodPractice {

    public static void main(String[] args) {
        String email = "John_Daniel@BOFA.com";

        int indexof_ = email.indexOf("_");
        int indexofAT = email.indexOf("@");


        String lastName = email.substring(0, indexof_ );

        String firstName = email.substring(indexof_ +1, indexofAT );

        String domain = email.substring(indexofAT + 1,email.lastIndexOf(".") );


        String fullName = firstName+" "+lastName;

        System.out.println("lastName = " + lastName);
        System.out.println("first Name = " + firstName);
        System.out.println("fullName = " + fullName);
        System.out.println("domain = "+ domain);




    }
}



/*
lastName_firstName@companyName.com

 */