package day27_ForEachLoop;

import java.util.Arrays;

public class CombinedTwoArray {

    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4};
        int [] arr2 = {5,6,7,8};

        int[] arr3 = new int[arr1.length+ arr2.length];  // the array MUST have the capacity to contain first and second array
        int j = 0; // represents the index numbers of 3rd array


        for(int each:arr1){ // 1 2 3 4
           arr3[j++] = each;
           /*
           arr3[0] = 1
           arr3[1] = 2;
           arr3[2] = 3
           arr3[3] = 4
            */
        }
        for(int each: arr2){  // 5,6,7,8
            arr3[j++] = each;
            /*
            arr[4] = 5;
            arr[5] = 6;
            arr[6] = 7;
             */
        }


        System.out.println(Arrays.toString(arr3));
    }
}
