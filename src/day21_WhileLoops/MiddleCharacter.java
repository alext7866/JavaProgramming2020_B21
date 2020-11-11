package day21_WhileLoops;

public class MiddleCharacter {

    public static void main(String[] args) {

        String word ="#";  // 3/2 = 1
        //            "javav" //5/2 = 2

        if(word.length()>=3){
            System.out.println(word.charAt( word.length() /2 ));
        } else if(word.length()==1){
            System.out.println(word+word+word);
        }






    }
}



/*
1. When word has odd number of characters and:
            - 3 or more characters, print middle letter
      oak ==> a
      javav ==> v
             - Single character, print that character 3 times
      # ==> ###
      q ==> qqq
2. When word has even number of characters and:
           - 4 or more characters, print middle 2
     java ==> av
     apples ==> pl
     #$%^&* ==> %^
           - 2 characters, print those 2 characters twice
      @@ ==>@@@@
      $$ ==>$$$$
      hi ==> hihi
 */