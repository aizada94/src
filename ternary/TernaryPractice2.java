package ternary;

import java.util.Locale;

public class TernaryPractice2 {
    public static void main(String[] args) {

         int a =3, b =5, k=7;

         // increments ++ / decrements --

        int r1 = a>= k ? a+ k++   :   ++b +k;    //3>=7         6+7=13


        System.out.println(r1);  //=13
        System.out.println(b);
        System.out.println(k);

        int r2 = k< ++b ? 2* ++k - 2 :  --k * 2 -1;     // 7<6     ? 2* 8 - 2 = 14  : 6*2 -1 = 11
        System.out.println(r2);  //=11

        System.out.println(k>=b? " I got this"  : false);
        System.out.println(k);
        System.out.println(b);

        System.out.println("test".equals("test")?  "TEST".toLowerCase() : 99);   //












    }
}
