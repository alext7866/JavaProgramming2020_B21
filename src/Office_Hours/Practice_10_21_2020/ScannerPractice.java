package Office_Hours.Practice_10_21_2020;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you score: ");
            int score =  scan.nextInt();

        String grade = "";

        if(score >= 0 && score <= 100){

            /* MULTI BRANCH IF */

      /*      if(score >= 90){ // BECOMES FALSE WHEN SCORE < 90
             grade = "A";
            }else if(score >= 80){  // BECOMES FALSE WHEN SCORE < 80
                grade ="B";
            }else if(score >= 70){  // BECOMES FALSE WHEN SCORE < 70
                grade ="C";
            }else if(score >= 60){  // BECOMES FALSE WHEN SCORE < 60
                grade = "D";
            }else{
                grade = "F";
            }
*/
            /* TernarY */

            grade = (score >= 90) ? "Excellent" : (score >= 80) ? "Great" :(score >= 70) ? "Good"
                    : (score>= 60)? "Passed" : "Fail";

        }else{
            grade = "Invalid";
        }

        System.out.println(grade);
    }
}

