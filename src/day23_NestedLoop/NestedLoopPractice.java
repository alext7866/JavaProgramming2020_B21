package day23_NestedLoop;

public class NestedLoopPractice {


    public static void main(String[] args) {

        for (int p = 1; p <= 8; p++) {  // p: 1, 2, 3, 4, 5, 6, 7, 8
            System.out.print("\t\t\t\t");
            for (int i = 1; i <= p; i++) { // i: 1,2,3,4,5,6,7,8
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("============================================");

        for(int a = 8; a >= 1; a--){
            System.out.println("\t");
            for(int b = a; b >= 1; b--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

/*
*
**
***
*****
******
*******
********
*********
 */