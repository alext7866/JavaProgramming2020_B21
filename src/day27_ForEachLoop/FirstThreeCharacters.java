package day27_ForEachLoop;

public class FirstThreeCharacters {

    public static void main(String[] args) {

        String [] names = {"Alex", "Robert", "roonay", "Andres", "John", "Erjon", "King", "Johnson", "Emily"};

        for(String eachNames : names){
            System.out.println(eachNames.substring(0,3));
        }
    }
}
