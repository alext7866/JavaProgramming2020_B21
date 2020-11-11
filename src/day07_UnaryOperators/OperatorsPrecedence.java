package day07_UnaryOperators;

public class OperatorsPrecedence {

    public static void main(String[] args) {

        int X = 2 + 3 *2 /1;
        //     2 + 6 / 1
        //       2 + 6 = 8

        System.out.println(X);

        int y = ( 2+3 ) * 2;
         //       5 * 2 = 10

        int z = 2 + 3 * 2;
        //       2 + 6 = 8

        System.out.println(y);
        System.out.println(z);


        int w = 78 / 2 * 2 + 3 - 5 % 5;
               // 39 * 2 +3 - 5 % 5



        System.out.println(w); //81

    }
}
