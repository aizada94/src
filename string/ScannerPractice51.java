package string;

import java.util.Scanner;

public class ScannerPractice51 {
    public static void main(String[] args) {
        // when we use nextLine() we can enter multiple words
        // when use next it will not take more than one word

        Scanner input= new Scanner(System.in);
        String str = input.nextLine();
        System.out.println("This value of first string " + str);
        String str1 = input.next();
        // For this one I cannot provide more than one word
        System.out.println("This value of string second " + str1);

    }
}
