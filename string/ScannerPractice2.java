package string;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {

        // BMI calculation *body mass index
        // BMI = weight(kg) / (height * height(meter))
        // 18 - 24
        //"your BMI is <BMI>"
        Scanner scanner = new Scanner(System.in);   // to take the data from user we shoul create the scanner object
        System.out.println("Please enter your weight in kg");
        double weight = scanner.nextDouble();

        System.out.println("Please enter yout height in meters");
        double height = scanner.nextDouble();

        double bmi = weight / (height*height);
        System.out.println( "Your BMI is "+bmi + " If your BMI is between 18-24 you are fit");







    }
}
