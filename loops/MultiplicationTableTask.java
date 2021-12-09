package loops;

import java.util.Scanner;

public class MultiplicationTableTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a whole number");
        int num = input.nextInt();
        int mult = 1;
        while (10>=mult){
                System.out.println(num+ " * " + mult+ " = " + (num * mult));
                mult++;
            }

        }
    }

