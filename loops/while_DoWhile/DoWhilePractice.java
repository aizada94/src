package loops.while_DoWhile;

public class DoWhilePractice {
    public static void main(String[] args) {
        //show your age from 21 to 26
        int age = 21;
        do{
            System.out.println("Your age is: " + age);
            age++;

        }while(age<27);

        System.out.println("===========");
        age = 21;
        while (age < 12){
            System.out.println(age);
            age++;
            //it doesn't print anything because of condition. Когда условия не выполняются в принтлн не отражается ничего


        }
    }

}
