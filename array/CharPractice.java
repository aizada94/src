package array;

import java.util.Arrays;

public class CharPractice {
    public static void main(String[] args) {
         //print out only digits from this array
         //store other than digits in a new array
         //

        char[] chs = {'A', '4', '&', 'z', '3', 'u', '*', 55};
        char[] others = new char[chs.length];
        int count = 0;    //count elements


        for( int a= 0; a < chs.length ; a++){
            if(chs[a]>='0' && chs[a]<='9' ){

                System.out.println(chs[a]);
                count++;

            }else{
                others[a] = chs[a];


            }

        }
        System.out.println(Arrays.toString(others));  //   -> these are representing the default value for number
        Arrays.sort(others);
        System.out.println(Arrays.toString(others));


    }
}
