package primitives;

public class UnaryPractice1 {
    public static void main(String[] args) {
        int studentNumber = 25;
        System.out.println(studentNumber++);  //shows 25 but it is 26
        System.out.println(studentNumber); // shows 26 and it still 26

        studentNumber++;
        System.out.println(studentNumber);

        int count = 5;

        System.out.println(++count); // increases to 6 and shows 6

        //=================================
        int number = 8;
        System.out.println(number--);   // shows 8 and it is 7
        System.out.println(number);// shows 7 and it is 6
        System.out.println(--number); //shows 5 and it is 5

        number++;
        System.out.println(number++ + number++); // shows 13 number is 8  but 7+8=15
        System.out.println(number);  //8

        int result = --number + --number +2 - number++ *2;  // 7+8+2-6*2
        System.out.println(result);  // number is 7

        //=====================

        int a = number++;

        System.out.println(a);
        System.out.println(number);








    }
}
