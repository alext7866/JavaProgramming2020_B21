package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {
          // salary: 100000,    taxRate: 0.28

        int Salary = 100000;
        double taxRate = 0.28;

        double totalTax = Salary * taxRate;
        double SalaryAfterTax = Salary - totalTax;

        System.out.println("Your total tax will be ");
        System.out.println(totalTax);


        System.out.println("your salary after tax will be ");
        System.out.println(SalaryAfterTax);


    }

}


/*
write a program that can calculate the salary after tax based on the salary and tax rate
			Ex:
				if salary = 100000
				   taxRate = 0.28

				   totalTax = salary * taxRate;
				   salary after tax = salary - totalTax
 */
