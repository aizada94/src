package loops.while_DoWhile;

public class DoWhilePractice1 {
    public static void main(String[] args) {
        //find and show sum of the numbers between 10 to 20 by using do while loop
           // a and b are my range. a=10 + 11+ 12+ 13+14...+19+b(20)
        int a = 1;
        int b = 3;
        int sum = 0;


        do{
            sum +=a;
            a++;

           // System.out.println("sum is: "  +sum);   if we put sout into do while==> it will show sum is 1, sum is 3, sum is 6 etc.

        }while(a<=b);
         System.out.println("sum is: "  +sum); 
    }
}
