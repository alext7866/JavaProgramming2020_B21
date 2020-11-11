package day27_ForEachLoop;

import java.util.Arrays;

public class UniqueChars {

    public static void main(String[] args) {
        String str = "aabbcddeef";
        char[] arr = str.toCharArray();   //  [a, a, b, b, c, d, d, e, e, f]

        // String [] arr = str.split("");

        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++) {
            char element = arr[j];
            int frquency = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == element) {
                    frquency++;
                }
            }
            if (frquency == 1) {
                System.out.print(element + " ");
            }
        }
    }
}