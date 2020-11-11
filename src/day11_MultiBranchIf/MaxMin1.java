package day11_MultiBranchIf;

public class MaxMin1 {

    public static void main(String[] args) {
        int a = 10;
        int b = 20000;

        int max1 = 0;
        if (a > b) {
            max1 = a;
        } else {
            max1 = b;
        }

        System.out.println(max1);

        int max2 = (a>b) ? a : b;
        System.out.println(max2);

        System.out.println("====================");
        int min1 = 0;
        if( a < b ){
            min1 = a;
        }else{
            min1 = b;
        }

        System.out.println("minimum number if: "+min1);

        int min2 = (a < b) ? a : b;

        System.out.println("minimum number if: "+min2);
    }
}



/*
Task:
	1. write a program that can find the maximum number between two different numbers
			first solution: if & else statement
			second solution: do not use any if statement


	2. write a program that can find the minimum number between two different numbers
			first solution: if & else statement
			second solution: do not use any if statement

 */