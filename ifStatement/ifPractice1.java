package ifStatement;

import java.util.Scanner;

public class ifPractice1 {
    public static void main(String[] args) {
        // get a number between 1 to 7 from user
        //print the name of the day for that given number from user
        // 1


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 1 to 7");
        double myNumber = input.nextDouble();
        int number = (int) myNumber;


        if(number ==1){
            System.out.println("1 --> Monday");
        }
        if(number ==2){
            System.out.println("2 --> Tuesday");
        }
        if(number == 3){
            System.out.println("3 --> Wednesday");
        }
        if(number ==4){
            System.out.println("4 --> Thursday");
        }
        if(number == 5) {
            System.out.println("5 --> Friday");
        }
        if(number == 6) {
            System.out.println("6 --> Saturday");
        }
        if(number== 7){
            System.out.println("7 --> Sunday");
        }

        // if the user enters out of range number
        // print your number is out of range

        if (number > 7 || number<1 ) {
            System.out.println("your entry is out of range");


        }


    }
}
