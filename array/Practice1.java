package array;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {

        int[] studentIds = new int[5];

        studentIds[0] = 21;
        studentIds[1]=31;
        studentIds[2]=41;
       // studentIds[3]=51;
       // studentIds[4]=61;
        //System.out.println(studentIds);   --> It will print out memory location for the array ->[I@29453f44
        System.out.println(studentIds[0]);
        System.out.println(studentIds[1]);
        System.out.println(studentIds[2]);
        System.out.println(studentIds[3]);
        System.out.println(studentIds[4]);



        studentIds[1] = 99;       //we reassign index1
        System.out.println(studentIds[1]);   //99   before it was 31

       // studentIds[5]= 51;    Index 5 out of bounds for length 5
       // System.out.println(studentIds[5]);  Index 5 out of bounds for length 5
        System.out.println("=================================");
        for( int i = 0; i < studentIds.length; i++){
            System.out.println(studentIds[i]);
        }
        System.out.println(Arrays.toString(studentIds));  // it will print out all elements as array from array







    }
}
