package day13_SwitchStatement;



public class Browsers {

    public static void main(String[] args) {
        String browserName = "chrome";

        boolean valid = browserName == "chrome" || browserName == "firefox" || browserName == "opera" || browserName == "safari"
                            || browserName == "edge" || browserName == "ie";

        if(valid){

            if(browserName == "chrome"){
                System.out.println("CHROME BROWSER IS SELECTED");
            }else if (browserName == "firefox"){
                System.out.println("FIREFOX BROWSER IS SELECTED");
            }else if (browserName== "opera"){
                System.out.println("OPERA BROWSER IS SELECTED");
            }else if (browserName == "safari") {
                System.out.println("SAFARI BROWSER IS SELECTED");
            }else if (browserName == "egde"){
                System.out.println("EDGE BROWSER IS SELECTED");

            }else if(browserName== "ie") {
                System.out.println("IE BROWSER IS SELECTED");

            }

            System.out.println(browserName);

        }
    }
}
