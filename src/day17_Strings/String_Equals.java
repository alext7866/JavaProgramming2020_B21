package day17_Strings;



public class String_Equals {

    public static void main(String[] args) {

        String str = "jira";
        String str2 = new String("jira");


        System.out.println(str == str2);
        System.out.println(str.equals(str2)); // this compares the value

        System.out.println(str. equals("Jira"));

        System.out.println(str.equalsIgnoreCase("JIRA"));


    }
}
