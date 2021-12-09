package ifStatement;

import java.util.Scanner;

public class NestedIfPractice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which city do you live in? ");

        String city = scanner.nextLine();

        if (city.equalsIgnoreCase("Chicago")) {

            System.out.println("Which courses are you attending?");
            String course = scanner.nextLine();
            if (course.equalsIgnoreCase("techtorial")) {
                 System.out.println("Which batch are you in?");
                 String batch = scanner.nextLine();

                    if (batch.equalsIgnoreCase("11")){
                        System.out.println("It is getting easier!");

                }else{
                         System.out.println("CONGRATULATIONS!!!!");

                    }
            }else {
                System.out.println("We are at Des Plains, please visit us");
            }

        }else{
            System.out.println("Please come to Chicago, you will like it in the summer");

        }

    }
}



