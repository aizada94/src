package primitives;

public class Farm {
    public static void main(String[] args) {
        /*
        in a farm, there are 12 cows and 23 chickens
        1. Find the total legs of the animal in the farm and print out
        2. If each cow costs $ 2345 and each chicken costs $23,99
            find the total worth of these animals and print out
         */

        int cow = 12;
        int chicken = 23;
        int totalLeg = (chicken * 2 )+ (cow * 4);
        System.out.println("total number of the legs in the farm is "+ totalLeg);


        double cow$ = 2345;
        double chicken$ = 23.99;

        double total$ = cow* cow$ + chicken+ chicken$;
        System.out.println("the total worth of the animal is= " +total$);






    }
}
