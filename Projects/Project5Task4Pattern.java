package Projects;

import java.util.Scanner;

public class Project5Task4Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1 -10");
        int numberOfRows = scanner.nextInt();
        for (int i = 1; i <= numberOfRows; i++){

            for(int j =1; j<=i; j++) {
                System.out.print(i + "");
            }
                System.out.println();


        }

    }
}
