package day23_NestedLoop;

public class CatDog {

    public static void main(String[] args) {
        String sentence = "dog dog Dog Dog cat CAT cAt CAt";

        String temp = sentence.toLowerCase();  // after this we do not need to worry about case sensitivity

        int countDog = 0;
        while(temp.contains("dog")){
            temp = temp.replaceFirst("dog", "");
            countDog++;
        }
        System.out.println("number of dogs: " + countDog);

        int countCat = 0;
        while (temp.contains("cat")){
            temp = temp.replaceFirst("cat", "");
            countCat++;

        }

        System.out.println("number of cats: " + countCat);

        System.out.println(countCat == countDog);
    }
}
