package day13_SwitchStatement;

public class SwitchStatement_Practice3 {

    public static void main(String[] args) {

        String browser = "chrome";

        String selectedbrowser = "";

        switch (browser){  // chrome

            case "chrome":
                selectedbrowser= "CHROME BROWSER";
                break;

            case "firefox":
                selectedbrowser = "FIREFOX BROWSER";
                break;

            case "opera":
                selectedbrowser = "OPERA BROWSER";
                break;

            case "safari":
                selectedbrowser = "SAFARI BROWSER";
                break;

            case "edge":
                selectedbrowser ="EDGE BROWSER";
                break;

            case "IE":
                selectedbrowser = "INTERNET EXPLORE BROWSER";
                break;

            default:
                selectedbrowser = "INVALID BROWSER";






        }

        System.out.println(selectedbrowser);


    }
}
