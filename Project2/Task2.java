package Project2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of quarters");
        double quarters = input.nextInt();
        System.out.println("Please enter number of dimes");
        double dimes = input.nextInt();
        System.out.println("Please enter number of nickles");
        double nickles = input.nextInt();
        System.out.println("Please enter number of pennies");
        double pennies = input.nextInt();

        double totalAmount = (nickles*5 + pennies*1 + dimes*10+ quarters*25)/100;
        System.out.println(totalAmount);

    }
    }

