package ifStatement;

import java.util.Scanner;

public class Hired {
    public static void main(String[] args) {
        /*==Task==
  nested if >>>> java>selenium>API>Sql
        -s/he knows Java yes/no
                yes: ask s/he knows Selenium

                        can learn: ask s/he has API testing experience
                        yes: ask s/he has API testing experience
                        no: we need someone who is familiar with Selenium
                                yes: ask s/he has Sql knowledge
                                        yes: "Congrat!! You are HIRED!!"
                                        no: We need someone who has Sql knowledge */
        System.out.println("Welcome! Do you know Java?");
        Scanner input = new Scanner(System.in);
        String java = input.nextLine();
        if (java.equalsIgnoreCase("yes")) {

            System.out.println("Do you know Selenium?   yes/no/ can learn");
            String selenium = input.nextLine();

            if (selenium.equalsIgnoreCase("yes") || selenium.equalsIgnoreCase("learn")) {
                System.out.println("Do you have API testing experience?");
                String api = input.nextLine();
                if (api.equalsIgnoreCase("yes")) {
                    System.out.println("Dou you have Sql knowledge?  yes/no");
                    String sql = input.nextLine();
                    if (sql.equalsIgnoreCase("yes")) {
                        System.out.println("Congrats! You are HIRED!!!");

                    } else {  //sql response
                        System.out.println("We need someone who has Sql knowledge");
                    }
                } else {
                    //api response
                    System.out.println("We need someone with API knowledge");
                }

            } else { //selenium response
                System.out.println("We need someone who is familiar with Selenium");

            }
            //java response
        } else {
            System.out.println("You should learn at least one programming language");


        }

    }
}
