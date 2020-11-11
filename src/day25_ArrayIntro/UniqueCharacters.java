package day25_ArrayIntro;

public class UniqueCharacters {

    public static void main(String[] args) {
        String str = "abcababe";

        String result = ""; // "ce"

        for (int j = 0; j < str.length(); j++) { // j represents the index num of str


            char ch = str.charAt(j);  // 'a'  each char in str
            int count = 0;  //1+1+1  for the frequency of ch

            for (int i = 0; i < str.length(); i++) { // i represnets the index num of str
                char eachChar = str.charAt(i);  // each characters of the string
                if (eachChar == ch) {
                    count++;
                }

            }  // count the frequency of ch

            if (count == 1) {
                result += ch;
            }
            System.out.println(result);


        }
    }
}