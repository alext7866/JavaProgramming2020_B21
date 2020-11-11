package day22_JavaRecap;

public class StringPractice3 {
    public static void main(String[] args) {

        String sentence = "Capital of Canada is Washington";

      sentence =  sentence.replace("Canada", "United States");
        System.out.println(sentence);


        String s = "Cybertek School is in Boston, Cybertek Campus is in Mclean";

                s = s.replaceFirst("Cybertek", "MIT");
        System.out.println(s);


        String r = "cava is programming language, i like to learn cava at cybertek school";

        r = r.replace("ca", "ja");

        System.out.println(r);

        String p = "I like Java and Java Java Java Java Java";
      p = p.replaceFirst("Java", "C#");
      p = p.replaceFirst("Java", "java");
      p = p.replace("Java", "");
       // p = p.replace("Java", "").replace("like ", "like java");

        System.out.println(p);

        System.out.println("===================================================");
        // trim: removes white spaces only

        String str = "                     ";
        System.out.println(str.length());

        str = str.trim();
        System.out.println(str.length());

        String str2 = "               Cybertek       School              ";
        System.out.println(str2);

        str2 = str2.trim();

        System.out.println(str2);

        System.out.println("====================================================");
        // contains, isEmpty, startsWith, endsWith

        String s2 = "I like to learn Java";

        System.out.println("Contains c#: " + s2.toLowerCase().contains("java"));

        System.out.println(s2.equals("java")); // false
        System.out.println(s2.equalsIgnoreCase("java")); // false

        String s3 = "Cybertek School is the best";

        System.out.println(s3.toLowerCase().contains("cybertek")); // true,  ignore case sensitivity

        System.out.println(s3.equals("cybertek"));
        System.out.println(s3.equalsIgnoreCase("cybertek"));


        System.out.println("Java".isEmpty()  );// false
        System.out.println("".isEmpty());// true


        System.out.println("==========================================");
        // startsWith, endsWith

        String URL = "http://www.amazon.com";

        boolean isValid = URL.startsWith("http") && (URL.endsWith(".com") || (URL.endsWith(".edu") || (URL.endsWith(".gov"))));

if(isValid){
    System.out.println("URL is valid");
}else{
    System.out.println("Invalid");
}

/*
valid emails: gmail, hotmail, yahoo, outlook
 */
        String email = "Java_Masters@java.com";

        boolean validemail = email.endsWith("gmail.com") || email.endsWith("yahoo.com")
                || email.endsWith("hotmail.com") || email.endsWith("outlook.com");

        if(validemail){
            System.out.println("valid email");
        }else{
            System.out.println("Invalid");
        }




    }
}
