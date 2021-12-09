package Project2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*I need to write a program that will take a given amount
of money and return the number of dollars in quarters,
dimes, nickels, and pennies that make up that given
amount
Example 1:
Please enter your balance:
2.36
$2.36 will make 9 quarters 1 dime 0 nickels and 1
pennies
Description */
        Scanner input = new Scanner(System.in);
        System.out.println("Please give the total amount of dollars");
        /*double total = input.nextDouble();
        double amountQ = total/0.25;
        amountQ = (int)amountQ;
        double amountQR = total%0.25;
        double amountD = amountQR*10;
        System.out.println(amountQ);
        System.out.println(amountQR);
        double amountDR = amountD%10;
        System.out.println(amountD); */
       // Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of quarters");
        double quarters = input.nextInt();
        System.out.println("Please enter number of dimes");
        double dimes = input.nextInt();
        System.out.println("Please enter number of nickles");
        double nickles = input.nextInt();
        System.out.println("Please enter number of pennies");
        double pennies = input.nextInt();

        double totalAmount = (nickles+ pennies*1 + dimes*10+ quarters*25)/100;
        System.out.println(totalAmount);

    }
}
