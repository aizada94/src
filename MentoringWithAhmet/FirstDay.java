package MentoringWithAhmet;
import java.util.Scanner;

public class FirstDay {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        //run loop until num becomes 0
        while(num != 0){

            //last digit from num
            int digit = num%10;
            rev = rev*10+digit;

            num/=10;
        }
        System.out.println(rev);
    }



}


