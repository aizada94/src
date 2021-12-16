package loops.while_DoWhile;

import java.util.Scanner;

public class PrintAgeTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        while ( 26 > age ){
            age++;
            System.out.println("'My age is' "+ age);
            //age +=1;
            //age = age +1;   ===> all these commands are increase age by 1.

        }
    }
}
