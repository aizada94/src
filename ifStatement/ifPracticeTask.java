package ifStatement;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class ifPracticeTask {
    public static void main(String[] args) {

    /*ask user to enter a single word
    if the word's first letter is:
    M --> there is a day starts with M >> Monday
    T -->                            T >> Tuesday/Thursday
    W -->                            W >> Wednesday
    S -->                            S >> Saturday / Sunday
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a single word");
        String word = input.nextLine().toUpperCase();
        if (word.startsWith("M")) {
            System.out.println("Monday");
        }

         if (word.startsWith("T")){
             System.out.println("Tuesday/Thursday");

        }
         if(word.startsWith("W")){
             System.out.println("Wednesday");
         }
         if(word.startsWith("F")){
             System.out.println("Friday");
         }
         if(word.charAt(0) == 'S'){
             System.out.println("Saturday/Sunday");
         }

         if(!word.startsWith("M") && !word.startsWith("T") && !word.startsWith("W") &&
                 !word.startsWith("F") && !word.startsWith("S")){
             System.out.println("There is no day !!!");


         }






    }
}
