package switchStatement;

import java.util.Locale;
import java.util.Scanner;

public class Practice2 {
    /* Ask user for his/her favorite fruit
-you have: mango, banana, kiwi, orange, apple, grape
if you have user's favorite fruit, --> We have your favorite fruit in our store
-orher wise: Sorry, we don't have your favorite fruit :( :
    *
    * */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your favorite fruit? Please enter your favorite fruit");
        String fruit = input.nextLine().toLowerCase(Locale.ROOT);

        switch (fruit.toLowerCase()){
            case "mango":
                System.out.println("We have your favorite fruit in the store");
                break;
            case "banana":
                System.out.println("We have your favorite fruit in the store");
                break;
            case "apple":
                System.out.println("We have your favorite fruit in the store");
                break;
            case "grape":
                System.out.println("We have your favorite fruit in the store");
                break;

            case "orange":
                System.out.println("We have your favorite fruit in the store");
                break;
            default:
                System.out.println("We Do Not have your favorite fruit in the store! Sorry!!");
                break;






        }

    }
}
