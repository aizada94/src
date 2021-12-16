package loops.forLoop;

public class Practice2 {

    public static void main(String[] args) {

        //print out numbers betwen 0 to 5 decreasing
        //by using for loop
         for(int a = 5; a >= 0; a--){
             System.out.println(a);

         }

         //find the total of numbers between 1 to 5 by using for loop
        // 1+2+3+4 = 10
        int sum = 0;
        for(int num = 1; num <5   ; num++){

            sum += num;

            System.out.println("Total "+sum );
        }
        System.out.println("Final total >> "+sum );
    }
}
