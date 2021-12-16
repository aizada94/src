package MentoringWithAhmet.InterviewQuestionsWithDebugging;

import java.util.Scanner;

public class FindTheMultiplicationOfNumber {
    //Write a programm that will accept numbers like 578432
    //get the multiplication of the number 5*7*8*4*3*2 -->

    //get the sum of the number 5+7+8+4+3+2
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scan.nextInt();

        //HOW AM I GOING TO REACH OUT EACH ELEMENT FROM THE INT?
        //I SHOULD USE THE MODULUS(REMAINDER) 10;   When we use Remainder always use While not For

        //123 --> %10  -->3
        //123/10 > 12 --> %10 -->2
        //12/10>1 --> %10 -->1
        int sumOfMult = 1;
        while( number != 0 ){
            int digit = number%10;
            number = number/10; //number/=10;
            sumOfMult = digit*sumOfMult;

        }
        System.out.println(sumOfMult);
    }
}
