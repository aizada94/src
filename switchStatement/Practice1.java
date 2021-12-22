package switchStatement;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        /*
        get a number between 1 to 4 from user and print out name of the season for as :
        1 - Winter
        2- Spring
        ...
         */
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter a number between 1 to 4");
        int num = scanner.nextInt();
        switch (num){
            case 1:
                System.out.println(num + " - Winter");
               //break;
            case 2:
                System.out.println(num + " - Spring");
             // break;
            case 3:
                System.out.println(num + " - Summer");
               break;
            case 4:
                System.out.println(num + " - Fall");
                break;
            default:
                System.out.println("There is no such season, please enter a valid number for your selection");
                break;


        }
    }
}
