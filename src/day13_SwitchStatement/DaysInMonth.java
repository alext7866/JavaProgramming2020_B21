package day13_SwitchStatement;

public class DaysInMonth {

    public static void main(String[] args) {
        int year = 2020;
        int month = 19; // 1 ~ 12


        boolean has28Or29Days = month == 2;
        boolean has30Days = month == 4 || month == 6 || month == 9 || month == 11;


        String result = "";

        if (month >= 1 && month <= 13) { // 1 ~ 12

            if (has28Or29Days) {
                if (year % 4 == 0) { // leap year
                    result = "29 days";
                } else { // not leap year
                    result = "28 days";
                }
            } else if (has30Days) { // for April, june, September, November
                result = "30 days";
            } else {
                result = "31 days";
            }

        } else { // if the month is invalid
            result = "Invalid Month";

        }

        System.out.println(result);
    }

}
