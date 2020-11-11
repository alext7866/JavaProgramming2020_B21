package day23_NestedLoop;

public class DoWhileLoop {

    public static void main(String[] args) {

        boolean condition = false;

        while(condition){  // think first
            System.out.println("hello batch 21");
        }

        System.out.println("========================");

        do{
            System.out.println("hello batch 21");
        }while(condition);  // do first, think later
    }
}
