package day20_ForLoop;

public class StringReverse {

    public static void main(String[] args) {

        String str = "cybertek";
                //    01234567
             String result ="";   // we want to contain the expected result which is the reveresed version of str
               // "ketrebyc"

       for(int i =7; i>=0; i--){
           result += str.charAt(i);
       }

        System.out.println(str);

    }


}


/*
5. write a program that can reverse any given string
			ex:
				input: abcd
				output: dcba

				input: Cybertek
				output: ketrebyC
 */