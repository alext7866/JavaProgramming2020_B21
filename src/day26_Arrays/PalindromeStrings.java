package day26_Arrays;

public class PalindromeStrings {

    public static void main(String[] args) {
        String[] names = {"Anna", "Nalan", "Hannah", "Emma", "Aidai", "Ciris", "Yasin"};


        int countPalindromes = 0;

        for (int j = 0; j <= names.length - 1; j++) {

            String Original = names[0];
            String reverse = "";

            for (int i = Original.length() - 1; i >= 0; i--) {
                reverse += Original.charAt(i);
            }
            if (Original.equalsIgnoreCase(reverse)) {
                countPalindromes++;
            }

        }
        System.out.println("countPalindromes " + countPalindromes);
    }
}