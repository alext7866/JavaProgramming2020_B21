package Office_Hours.Practice_10_28_2020;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "abab";       // "ab"

                String nonDup = "";  //  "ab"
                         // if the character does not exist in nonDup, then we can concate it.

        for(int i = 0; i <= str.length()-1; i++){
            String eachchar = ""+str.charAt(i);
            if( !nonDup.contains( eachchar  )){  // if the character is already contained in nonDup
                continue;

            }else{
                nonDup += eachchar;
            }
        }

        System.out.println(nonDup);

    }
}
