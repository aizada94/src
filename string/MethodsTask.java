package string;

import java.util.Scanner;

public class MethodsTask {
    public static void main(String[] args) {

        // -Task: get string from user
        //	print first, last, middle, second matching 'c', lenght, index of x

        /* Steps:
        -create scanner object to get input from user
        -let user about what to do
        -store incoming value
        -implement different methods to achieve your goal
         */
        Scanner scanner = new Scanner(System.in); //creating scanner object
        System.out.println("Please enter a string value"); // let user about what to do
        String str = scanner.nextLine(); // store incoming value

        System.out.println("The first letter is "+ str.charAt(0));   // print the first char of string
        System.out.println("The last letter is "+ str.charAt(str.length()-1)); // last
        System.out.println("Middle char is "+ str.charAt(str.length()/2)); // middle

        System.out.println("Second matching c's index number is "+ str.indexOf('c', str.indexOf("c")+1));
        System.out.println("The length of the string is "+ str.length());
        System.out.println("The index of 'x' is "+ str.indexOf("x"));




    }
}
