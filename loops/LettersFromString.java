package loops;

import java.util.Scanner;

public class LettersFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = sc.nextLine();
        int i = 0;
        while (i < str.length()) {
            System.out.print(str.charAt(i) + ", ");
            i++;

        }
        System.out.println();
        //print those letters in reverse order
        int lastChar = (str.length() - 1);
        while (lastChar >= 0) {
            System.out.print(str.charAt(lastChar) + " , ");
            lastChar--;
        }
        System.out.println();

        //Count how many lowercases in the given string   HOMEWORK!!!!!

        }

        }

