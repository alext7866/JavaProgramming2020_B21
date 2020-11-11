package day28_MultiDimensionalArray;

import java.util.Scanner;

public class replit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        //TODO: start your code here
        String[] arr = sentence.split(" ");

          for(int i = arr.length-1; i >=0; i--){
              reversed += arr[i]+" ";
            }


            //End your code here. do not modify below statement
        reversed = reversed.trim();
            System.out.println(reversed);
        }
    }




