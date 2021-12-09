package Homework;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        System.out.println("Please enter a string value");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.length()%2!=0){
            int middleLength = str.length();
            String middle = str.substring(str.length()/2 +2);
            System.out.println(str);
        }
    }
}
