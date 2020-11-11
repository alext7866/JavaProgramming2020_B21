package day19_ForLoop;

public class ForLoopIntro {

    public static void main(String[] args) {

        System.out.println("hello");
        for(int i = 1; i <= 10; i++ ){
            System.out.println("hello");
        }

        System.out.println("=======================");

        String name = "Alex";
        for(int i =5; i > 0; i-- ){  // i: 5, 4, 3, 2, 1, 0
            System.out.println(name); // 1 ,2, 3, 4, 5
        }
    }
}
