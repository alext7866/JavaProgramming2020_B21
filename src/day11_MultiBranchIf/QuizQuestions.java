package day11_MultiBranchIf;

public class QuizQuestions {

    public static void main(String[] args) {

        int ivar = 100;
        double dvar = 200;
        float fvar = 300;

        ivar = (int)fvar;  // explicit casting
        fvar = ivar; //implicit casting
        dvar = fvar;  // implicit casting
        fvar = (float)dvar; //explicit casting
        dvar = ivar;  // implicit casting
        ivar = (int)dvar; // explicit casting



    }
}
