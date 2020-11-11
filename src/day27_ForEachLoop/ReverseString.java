package day27_ForEachLoop;

public class ReverseString {

    public static void main(String[] args) {

        String[] names = {"Alex", "Yosan", "Mickey", "Snoop", "Mehra"};

        for (String eachName:names) {
            String reversedName = "";
            for(int i = eachName.length()-1; i>=0; i--){
                reversedName += eachName.charAt(i);
            }

            System.out.println(reversedName);
        }
    }
}
