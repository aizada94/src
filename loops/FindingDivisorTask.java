package loops;

import java.util.Scanner;

public class FindingDivisorTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer value");
        int value = input.nextInt();
        int divisor = 1;

        while (divisor <= value) {
            if (value % divisor == 0){

            System.out.println(divisor + " is divisor of " + value);
        }
        divisor++;
    }

    }
}
