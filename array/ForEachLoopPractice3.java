package array;

import java.util.Arrays;
import java.util.Locale;

public class ForEachLoopPractice3 {
    public static void main(String[] args) {
        String[] names = {"John", "Brian", "Easy", "Nina", "David"};

        //create e-mail address for each of the names in the array
        // john@gmail.com, brain@gmai.com
        //store these e-mails in a array
        //if it is gmail e-mail, store it in gmail array
        String [] gMails = new String[names.length];
        String [] yahooMails = new String[names.length];

        for( String name: names){
            System.out.println(name+"@gmail.com");
                System.out.println(name.toUpperCase().concat("@yahoo.com"));

        }
            System.out.println("*******************");

              for( int i = 0; i < names.length; i++){
                  gMails[i]= names[i]+ "@gmail.com";
                  yahooMails[i] = names[i].toUpperCase().concat("@yahoo.com");
            }
            System.out.println(Arrays.toString(gMails));
            System.out.println(Arrays.toString(yahooMails));
    }
}
