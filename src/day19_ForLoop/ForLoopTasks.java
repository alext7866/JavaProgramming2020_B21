package day19_ForLoop;

public class ForLoopTasks {

    public static void main(String[] args) {

        for(int i = 0; i <= 1000; i++){
            System.out.println(i);
        }


        for(int i = 1000; i <= 2000; i++){
            System.out.println(i);
        }

        System.out.println("=====================");

        //odd numbers 1,3 5 7 9 11...

        for(int i = 1; i <= 100; i += 2){
            System.out.print(i+" ");
        }

        System.out.println();

        System.out.println("Hello");

        for(int i =1; i <= 100; i++){
            if(i % 2 != 0){
                System.out.print(i+" ");
            }

        }

        System.out.println("========================");
        // even numbers 0 2 4 6...100
        for(int i =0; i <= 100; i += 2){
            System.out.print(i+" ");
        }

        System.out.println();

        System.out.println("=====================");

        for(int i = 0; i <= 100; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }


        }


        System.out.println();

        System.out.println("========================");

        for(int i = 1; i <= 50; i++){
            System.out.println("Push up " + i);
        }


    }


}
