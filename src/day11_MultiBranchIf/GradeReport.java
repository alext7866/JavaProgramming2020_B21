package day11_MultiBranchIf;

public class GradeReport {

    public static void main(String[] args) {
        int score = 90; // o ~ 100

        if (score < 60) {
            System.out.println("Failed");

        } else if (score >= 60 && score < 90) {
            System.out.println("passed");

        } else { // score>= 90
            System.out.println("Passed with distinction");
        }


    }

}
