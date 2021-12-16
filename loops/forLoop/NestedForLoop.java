package loops.forLoop;

public class NestedForLoop {
    public static void main(String[] args) {

        for (int i=0; i<3; i++){
            System.out.println("I am FIRST for loop");


            for(int j = 0; j<5; j++) {

                System.out.println("I am NESTED for loop");
            }
        }
    }
}
