package Homework;

import java.util.Scanner;

    public class replit {
        public static void main(String[] args) {
            System.out.println("Please enter a string value");
            Scanner input = new Scanner(System.in);
            String value = input.nextLine();
            if (value.length() % 2 == 0) {
                System.out.println(value.substring(0));

            }
        }
    }