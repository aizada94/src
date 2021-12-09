package string;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        // Use Scanner
        // to get name date of year of user
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = input.nextLine();
        System.out.println(name);
        System.out.println("Year of birth");
        int year = input.nextInt();
        int current = 2021;
        int age = current - year;
        System.out.println("Your age is " +age);

        int currentYear = LocalDateTime.now().getYear();
        System.out.println(currentYear);
        int currenMinute = LocalDateTime.now().getMinute();
        System.out.println(currenMinute);


    }
}
