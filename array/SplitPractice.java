package array;

import java.util.Arrays;

public class SplitPractice {
    public static void main(String[] args) {

        String str = "Stay safe and Healthy";

        String[] words = str.split(" ");
        System.out.println(str);
        System.out.println(Arrays.toString(words));

        //Print out every single word as: ... ***
        for(String x: words) {
            System.out.println(x.concat("***"));
        }

       String[] words2 =  str.split("a", 4);
        System.out.println(Arrays.toString(words2));
        System.out.println(words2.length);


        // 12/17/2021
        //12.17.2021
        // 12-17-2021
        //12_17_2021
        //Separate those days,month and years

        String date = "12_17_2021";
        String [] splitDate = date.split("_");
        System.out.println(Arrays.toString(splitDate));
        //use 12.17.2021
         date= "12.17.2021";
        String [] splitDate2 = date.split("\\.");
        System.out.println("This is for dot example " +Arrays.toString(splitDate2));

        //use 12_17_2021
         for(String d: splitDate2) {
             System.out.println("\"something\"");

             //[12, 17, 2021]
             for(String element: splitDate2){
                 System.out.println("\""+element+"\"");


             }


         }












    }
}
