package array;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {
        String[] names = new String[6];
        System.out.println(Arrays.toString(names));

        names[0] = "Alex";
        names[4]= "Dinara";
        names[2]= "Ana";
        names[5] = "Mary";
        System.out.println(Arrays.toString(names));
        System.out.println(names[3]);


        //Show all values from the 'names' array one by one
       for(int i=0; i< names.length; i++){
           System.out.println(names[i]);
          // System.out.println(i); it will show only numbers of index
          // System.out.println(names);      it will print out hashcode 6 times ->  [Ljava.lang.String;@29453f44


       }



    }
}
