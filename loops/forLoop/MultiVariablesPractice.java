package loops.forLoop;

public class MultiVariablesPractice {
    public static void main(String[] args) {

        for(int a=3, b=10 ; a < 10 && b> 0   ; a++, b-- ){  //both side has to be true to give a result
            System.out.println("a is   >>> "+a);
            System.out.println("b is  >>> "+b);


        }

        System.out.println("=============================");

        int x =1;
        int y = 5;
        for(    ;  x< 10 && y>0 ; x++, y--  ){      //we can use && and ||



            System.out.println("Hello");
        }

        System.out.println("==========================================");

        int k;
        for(x=1, y=5, k= 9; x < 10 || y > 0 ; x++, y--, k++){
            System.out.println("BYE");
            System.out.println("k ---> "+k);
            System.out.println(x*k);
            String str= k>= y ? "Saturday" : "Sunday";
            System.out.println(str);
            System.out.println("$$$$$$$$$$$$$$$$$$");
        }

    }
}
