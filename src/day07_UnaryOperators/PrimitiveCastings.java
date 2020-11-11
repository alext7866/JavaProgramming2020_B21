package day07_UnaryOperators;

public class PrimitiveCastings {

    public static void main(String[] args) {
        short a = 3000;
        long b = a;  // Implicit casting
        // = 3000L

       // int c = b; // casting MUST be done manually

        double d1 = 200.5;
        int i1 = (int)d1;  // 200

        System.out.println(i1);

        System.out.println("==========================");
        long l1 = 100;
        short s1 = (short)l1;  // explicit casting

        double d2 = 300;
        float f1 = (float) d2;


        long l2 = 300;   //implicit casting
                     // 300l
        int i2 = (int) l2;
                  // 300

        System.out.println("=======================");
        short s2 = 400;
        byte b1 = (byte)s2;  // -128 <= byte <= 127
        System.out.println(b1);  // the value 400 is out byte' range, and casting does not change the limit of data


        long l3 = 100;
        byte b2 = (byte) l3;

        System.out.println(b2);




    }
}
