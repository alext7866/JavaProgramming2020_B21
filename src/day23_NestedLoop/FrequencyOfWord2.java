package day23_NestedLoop;

public class FrequencyOfWord2 {
// without case sensitivity
    public static void main(String[] args) {

        String sentence = "Java Java java java";
        String word = "Java";
               word = word.toLowerCase();

        String temp = sentence.toLowerCase();  //"java java java java"
        int count = 0;

        while (temp.contains(word.toLowerCase())){
            temp = temp.replaceFirst(word, "");
            count++;
        }

        System.out.println(count);


    }
}



   /* warmup task:
        1. write a program that can return the frequncy of the a word from the sentence
        Ex:
        sentence = "Java is a programming language, I like to learn Java";
        word = "Java";

        output:
        2

        sentence.contains(Java)

    */