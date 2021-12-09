package loops;

import java.util.Scanner;

public class MakingStarTree {
    public static void main(String[] args) {


    /*
     -Ask user to provide a number between 3 to 10
  - make a star tree for that many line
  (Use Do-While Loop to implement solution)
    ex: input --> 4
                  *
                  **
                  ***
                  ****
     */
        System.out.println("Please enter number between 3 to 10");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = 0;
        String star = "*";
        do {
            System.out.println(star);

            star +="*";
            x++;


        } while (num>x);

    }
}