package Projects;

import java.util.Scanner;

public class Project5Task3Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isPrime = true;
        for(int i =2; i<number/2; i++) {

            if(number%i == 0){
                isPrime=false;
                break;

            }
        }
        if(isPrime){
            System.out.println(number+ " Prime number");
        }else{
            System.out.println(number+ " is NOT a Prime number");
        }
    }

}
