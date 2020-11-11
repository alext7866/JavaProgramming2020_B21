package day17_Strings;

public class String_Memory {

    public static void main(String[] args) {

         /*
            String pool:
    strOne  ---->     "java"      <-----strTwo

         */

        String strOne = "java"; // literal
        String strTwo = "java"; // literal
        String strThree = new String("java");
        String strFour = new String("java");
        String strFive = "Java";

        System.out.println(strOne == strTwo);
        System.out.println(strOne == strThree);

        System.out.println(strThree == strFour);

        System.out.println(strOne == strFive);

    }
}


