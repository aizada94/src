package primitives;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class RemainderPractice2 {
    // find a product of digits of given number
    // 456   ==> 4 * 5 * 6 = 120 sout("The product is=" +product)
    public static void main(String[] args) {
        int myNumber = 456;
        int digit4 = myNumber % 10;
        myNumber = myNumber/10;
        int digit5 = myNumber%10;
        myNumber= myNumber/10;
        int  digit6= myNumber % 10;
        myNumber = myNumber / 10;
        System.out.println(digit6);
        System.out.println(digit5);
        System.out.println(digit4);
         int product = digit4 * digit5 * digit6;
        System.out.println("The product is=" +product);



        int num =456;
        int d1 = num % 10;
        num= num/10;
        int d2 = num % 10;
        num = num/10;
        int d3 = num % 10;
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        int product2 = d1 * d2 * d3;
        System.out.println("The product is= "+(d1 * d2* d3));
        System.out.println("The product is= "+ product2);





    }


}
