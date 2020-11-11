package day25_ArrayIntro;

public class ArrayIntro {

    public static void main(String[] args) {

        String[] names = {"Alex", "Muhtar", "Azad", "John", "Rob"};
         // index num:      0        1         2       3       4

        // retrieve data from array:

       String name1 =  names[1];
        System.out.println(name1);

        int[] score = {80,85,90,70,75,78};
        // index:       0  1  2  3  4  5

        //System.out.println(names[2]+ " : " + score[3]);//

        for(int i = 0; i <= 4; i++){  // i: 0, 1, 2, 3, 4
            System.out.println(names[i]+ " : " + score[i]);
        }


    }

}