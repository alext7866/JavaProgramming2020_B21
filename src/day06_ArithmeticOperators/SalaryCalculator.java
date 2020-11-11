package day06_ArithmeticOperators;

public class SalaryCalculator {

    public static void main(String[] args) {

        double salary = 100000;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.21;

        double stateTax = salary * stateTaxRate;
        double federalTax = salary * federalTaxRate;
        double totalTax = stateTax + federalTax;

        double salaryAfterTax = salary - totalTax;

       /*
       double salary = 100000, stateTaxRate = 0.08, federalTaxRate = 0.21,
               stateTax = salary * stateTaxRate, federalTax = salary * federalTaxRate,
               totalTax = stateTax + federalTax, salaryAfterTax = salary - totalTax;

        */

        System.out.println("Your Salary is: $ "+salary);
        System.out.println("State tax is: $ " +stateTax);
        System.out.println("federal tax is: $ " +federalTax);
        System.out.println("total tax is: $ " +totalTax);
        System.out.println("salary after tax is: $ " +salaryAfterTax);

    }

}






/*
SalaryCalculator
    variables: salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax
                100000    0.08         0.21
    output:
        Your salary is: YourSalary
        Your State Tax: YourStateTax
        Your federal Tax: federalTax
        your total tax: TotalTax
        your salary after tax: YourSalaryAfterTax

 */