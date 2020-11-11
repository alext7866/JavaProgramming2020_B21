import java.util.Scanner;

public class repLit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();

        int counter = 0;
        while(word.contains("java")){
            word = word.replaceFirst("java","");
            counter++;
        }
        System.out.println(counter);
    }
}
