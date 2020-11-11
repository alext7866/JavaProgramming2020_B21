package day26_Arrays;

public class FrequencyOfEachChar2 {

    public static void main(String[] args) {
        String str = "aaabbc";   // "a3b2c1"
        String expectedResult = "";   //"a3b2c1"


        for (int j = 0; j < str.length(); j++) {  // j represents the index num of the string


            char ch = str.charAt(j); // a, a, a, b, b, c
            int count = 0;

            for (int i = 0; i < str.length(); i++) {  // i represents the index num of str
                char eachChar = str.charAt(i);
                if (ch == eachChar) {
                    count++;
                }
            }

if(!expectedResult.contains(""+ch)){
    expectedResult += "" + ch + count;
}
            System.out.println(expectedResult);
        }
    }
}