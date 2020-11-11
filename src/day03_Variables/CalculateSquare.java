package day03_Variables;

import java.sql.SQLOutput;

/*
declare variables:
      DataType name= Data;
 */
public class CalculateSquare {

    public static void main(String[] args) {

        // side: 10
        int side = 10;  // to make it reusable

        int area = side * side;  //another info that we gained by using side
                                 // to make it reusable

        int perimeter = side * 4;  //another info that we gained by using side
                                   // to make it reusable

        System.out.println("Area of square is: ");
        System.out.println(area);

        System.out.println("Perimeter of Square: ");
        System.out.println(perimeter);


    }
}
