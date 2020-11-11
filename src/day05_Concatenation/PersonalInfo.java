package day05_Concatenation;



public class PersonalInfo {

    public static void main(String[] args) {

        String firstName = "Alex";
        String lastName = "Tsegaye";
        String fullName = firstName+" "+lastName;
        int age = 25;
        char gender = 'M';
        long phoneNumber = 7888877779l;
        long SSN = 6699969696l;

        System.out.println("Full Name is: "+ fullName );
        System.out.println("Age is: "+ age + " years old" );
        System.out.println("Gender is: " + gender );
        System.out.println("Phone number: "+ phoneNumber);
        System.out.println("Social Security: "+ SSN);


    }
}
