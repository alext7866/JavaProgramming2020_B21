package day22_JavaRecap;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "abcabc";  // A, A, A, B, B
        String result = "";  // "abc"

        for(int i = 0; i <= str.length()-1; i++){
            String eachCharactar = ""+str.charAt(i); // a, b, c, a, b, c

            if(result.contains(eachCharactar)){  // if the character is already contained in the result then we skip that character
                continue;
            }else{ // IF THE CHARACTER OF STR IS NOT CONTAINED IN THE RESULT YET, THEN WE CONCATE THE CHARACTER.
                result += eachCharactar;
            }


/*
            if(!result.contains(eachCharactar)){
                result += eachCharactar;
            }

 */
        }

        System.out.println("Result = " + result);





    }
}
