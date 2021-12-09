package loops;

import java.util.Random;
import java.util.Scanner;

public class HeadTailGame {
    public static void main(String[] args) {
        Random random = new Random();
    /*
     HAED-TAIL Game:
          /*
        I want to create a head/tail game (flipping coin) with java codes;
        -At the beginning print "Game is started, MAKE a GUESS! HEAD/TAIL "
          So, let user know that the game started.
            - get user's guess as HEAD/TAIL
            - compare user's guess with your random number 0/1 --> random.nextInt(2) <--
                - if guess is correct, print       ---> "You are lucky, it is your day today."  compare the users choise
                - if the guess isn't correct, print  -> "Sorry, that was not the correct choice!"
            - at the end, ask user "Do you want to play again? Y/N "
                - if the answer is Y --> keep playing (this is your while condition!!!)
                - if the answer is N --> print --> "Its Ok, SEE you NEXT time!"


                you need to use
                *ternary
     */
        System.out.println("Game is started, MAKE a GUESS! HEAD/TAIL");
        do{

        }while()


        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to play again? Y/N");
        String answer = sc.nextLine();
        if(answer=='Y')

    }
}