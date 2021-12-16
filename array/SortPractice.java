package array;

import java.util.Arrays;

public class SortPractice {
    public static void main(String[] args) {

        int [] zipCodes = {61212, 91213, 11214, 71215 };

        System.out.println(Arrays.toString(zipCodes));
        Arrays.sort(zipCodes);  // is  going to arrange/ organize our inputs from smaller to larger one
        System.out.println(Arrays.toString(zipCodes));


        System.out.println("=================");
        String[] colors = {"violet", "Pink" , "Red", "White", "Black", "brown"};
        Arrays.sort(colors);  // it will organize by alphabetic range
        System.out.println(Arrays.toString(colors));


    }
}
