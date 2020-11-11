package day14_Switch_Recap;

public class SalaryCalculator {

    public static void main(String[] args) {
        int hourlyRate = 45;
        int weeklyHours = 45 ;
        int numberOfWeeks = 50;

        int salary = 0;

        if(hourlyRate > 0){

            if(weeklyHours >1 && weeklyHours <= 65){

               if(numberOfWeeks >1 && numberOfWeeks <= 52){

                   salary = hourlyRate*weeklyHours*numberOfWeeks;



               }else{
                   System.out.println("number of weeks cannot be less than 1 or greater than 52");
               }

            }else{
                System.out.println("weekly hours cannot be less than 1 or greater than 65");
            }

        }else{
            System.out.println("hourly Rate cannot be Negative or 0");
        }


        System.out.println("your salary is: "+salary);




    }



}






/*
 write a program for the salary calculator
			given info:
					hourlyRate 40$
					weeklyHours 45 hours
					numb write a program for the salary calculator
			given info:
					hourlyRate
					weeklyHours
					numberofWeeks
			pre conditions: hourlyRate cannot be negative
							weekly hours cannot be negative or more than 65
							numberOfWeeks cannot be more than 52 weeks or less than 1erofWeeks 48 weeks
			pre conditions: hourlyRate cannot be negative
							weekly hours cannot be negative or more than 65
							numberOfWeeks cannot be more than 52 weeks or less than 1
 */