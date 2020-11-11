package day14_Switch_Recap;

public class QualificationForArmy {

    public static void main(String[] args) {

        String citizen = "Canada";
        boolean isResident = false;
        boolean isAlien = true;

        boolean hasHighSchoolDiploma = true;

        boolean numberOfDependent = false;

        int age = 18;

        if(citizen == "USA" || isResident || isAlien){

            if(age>=17 && age <= 34){

                if(hasHighSchoolDiploma){

                    if(numberOfDependent ){
                        System.err.println("you must Have no more than two dependents");

                    }
                    System.out.println("you are qualified for the Us army");

                }else{
                    System.err.println("you must have a high school diploma");
                }

            }else{
                System.err.println("Be between the ages of 17-34 years old");
            }


        }else{
            System.err.println("You must be a U.S. citizen or a resident or alien");
        }


    }
}




/*
	2. What are the qualifications to join the Army?
			You must be a U.S. citizen or a resident alien.
			Be between the ages of 17-34. ...
			Have a high school diploma.
			Have no more than two dependents.

 */