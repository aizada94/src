package string;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {

        //We will ask user to their first name
        //We will ask user to their last name
        //We will print firstName in lower case
        // last name in upper case

        //.toLowerCase(); == makes all letters lower case
        //.toUpperCase(); == makes all letters lower case

        String str = "yusuf";
        str.toUpperCase();
        // If we don't reassign the string
        //it will not change its value
        System.out.println(str);
        //yusuf
        str = str.toUpperCase();
        System.out.println(str);
        //
        //We will ask user to their first name
        //We will ask user to their last name
        //We will print firstName in lower case
        // last name in upper case

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName = scanner.next();
        System.out.println("Please enter your last name");
        String lastName = scanner.next();

        System.out.println(firstName.toLowerCase() +" "+ lastName.toUpperCase());
        System.out.println(lastName);
        // if I print like this will I changed values or
        // non changed



    }
}
