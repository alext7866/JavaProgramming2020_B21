package day23_NestedLoop;

public class NestedLoopIntro {

    public static void main(String[] args) {

       /* for(int i = 1; i <=10; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        for(int i = 1; i <=10; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        */

        for(int j =1; j <= 20; j++){

            for(int i = 1; i <=50; i++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        System.out.println("==========================================");


        for(int i = 1; i <= 7; i++){
            System.out.print("*");
        }
        System.out.println();


        for(int p = 1; p <= 10; p++){

            for(int i = 1; i <= 20; i++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
