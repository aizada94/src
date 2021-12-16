package MentoringWithAhmet.InterviewQuestionsWithDebugging;

import java.util.Scanner;

public class ReverseTheWordsAndNumbers {
    public static void main(String[] args) {
        //Ask the user to input a word and reverse it
        //Ask user to input a number and reverse it
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = sc.nextLine();
        //you have to know meaning of the reverse(opposite) Ahmet-> temha
        //HOW AM I GOING TO REVERSE A STRING?
        //HOW CAN I REACH OUT EACH OF THE CHARACTER FROM STRING?
        //WHERE AM I GOING TO STORE THEM AS REVERSE?

        // I think I should use the loop to reach out (вытянуть из слова каждую букву) each element
           String name= "";
           for(int i=word.length()-1; i>=0; i--) {
               name += word.charAt(i);
           }
            System.out.print(name);

            //homework do the number one. integer and reverse it.

        }

        }






