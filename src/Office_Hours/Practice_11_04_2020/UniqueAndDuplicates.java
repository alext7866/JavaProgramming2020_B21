package Office_Hours.Practice_11_04_2020;

import java.util.Scanner;

public class UniqueAndDuplicates {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = scan.next();

        String unique = "";    // "bd";
        String duplicates = "";
      for(int j = 0; j <str.length(); j++){

          char ch = str.charAt(j);   // 'a' , 'a', 'b', 'c','c', 'd'
          int frequency = 0;   // frequency of ch

          for(int i = 0; i <str.length(); i++){ // for finding the frequency of 1 character at a time
              if(str.charAt(i) == ch){
                  frequency++;
              }
          }
          if(frequency == 1){ // if frequency is 1, it means the ch is unique
              unique += ch;
      }
          if(frequency>1 ){   // if frequency is more than 1, it means the ch is duplicate
              duplicates += ch;  // && !duplicates.contains(""+ch);
          }


        }
        System.out.println(unique);
        System.out.println(duplicates);


    }
}
