package ifStatement;

import java.util.Scanner;

public class ElseIfTask {
    public static void main(String[] args) {
        /*
        get three test results from 0-100 from user and calculate the average of those three tests
        based on the average score:
        -print out letter grade for this student
        average is --> 100-90 --> your letter grade is A
        average is --> 89 - 80 --> your letter grade is B
        average is --> 79 -60 --> your letter grade is C
        average is --> less than 60 --> "you should take the course again"
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter fisrt test result");
        int test1 = sc.nextInt();
        System.out.println("Please enter second test result");
        int test2 = sc.nextInt();
        System.out.println("Please enter third test result");
        int test3 = sc.nextInt();
        int average = (test1+test2+test3)/3;

        if (average <=100 && average>=90 ){
            System.out.println("your letter grade is A");
        }else if(average<=89 && average>= 80){
            System.out.println("your letter grade is B");
        }else if(average<=79 && average>=60){
            System.out.println("your letter grade is C");
        }else{
            System.out.println("You need to take the course again");
        }
    }
}
