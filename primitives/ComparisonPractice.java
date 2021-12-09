package primitives;

public class ComparisonPractice {
    public static void main(String[] args) {
         float fl = 4;
         int i = 4;
        System.out.println(fl == i); //
        boolean comp1 = fl == i ;
        System.out.println(comp1);


        System.out.println(18==18);

        System.out.println('a'== 'A');
        System.out.println("test" == "tesT");

        //!=
        int num1 = 55;
        int num2 = 66;
        boolean comp2 = num1 != num2;
        System.out.println(comp2);  // true

        System.out.println(18 !=18);  // false

// ----- <less than
        System.out.println(num1 < num2);  // true
        System.out.println(55 < num1);  // false  55<55? NO
        System.out.println(num2 < num1); // false
        System.out.println('c' < 'c'); //
        System.out.println('c' < 'd');
 //-------- > greater than
        System.out.println( num1 > num2); // false
        System.out.println(num2 > 109); //false
        System.out.println(num2++ > 66);  //false
        System.out.println(num2 > 66);   // true

//--------   <=   less than or equals
        num1 = 2; num2 = 3;
        System.out.println(num1 < num2);  // true
        System.out.println(num1 <= num2); // true

        System.out.println(3 <= num2);   // true
        num1++;
        System.out.println(num1 <= num2);   // true
        System.out.println(++num1 <= ++num2);

   //----------------    >= greater than or equals to
        System.out.println(num2 >= num1);  //true

        System.out.println(num1); //=4
        System.out.println( num2); //=4
        System.out.println(7 >= ++num1 + num2);  // false   (7 >= = 5+ 4)

        char ch3 = 'P';
        char ch4 = 80;
        System.out.println(ch3 == ch4);









        System.out.println(7 >= ++num1 +num2);  // false
























    }
}
