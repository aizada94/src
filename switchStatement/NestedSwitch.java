package switchStatement;

import java.time.LocalDateTime;
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        /*
        1- IT dept
            David,Tima
        2- Admin
             Alex. Jessi

        3- Customer Care
             Zack, Ana, John

         */
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter a number from 1 to 3 to choose a department. 1 - IT dep, 2 - Admin and 3 - Customer Care");
        int department = scanner.nextInt();
        switch (department){
            case 1:
                System.out.println("You are in IT dept, Who do you want to speak with? Please enter name:David and Tima");
                scanner = new Scanner(System.in);
                String name = scanner.nextLine().toLowerCase();
                switch (name){
                    case "david":
                        // want to differ morning and afternoon hours
                        int hour = LocalDateTime.now().getHour();
                        System.out.println(hour);
                        if(hour > 8 && hour < 12){
                            System.out.println("I am still not in the office");
                        }else if(hour>12 && hour <17) {
                            System.out.println("Hello! This is David");
                        }
                            break;

                    case "tima":
                        System.out.println("Hello! This is Tima");
                        break;
                    default:
                        System.out.println("We don't have " + name.toUpperCase()
                        );
                }
                break;
            case 2:
                System.out.println("You are in Admin department. Who do you want to speak with? Please choose one of them: Alex and Jessie" );
                scanner = new Scanner(System.in);
                String nameAdmin = scanner.nextLine().toLowerCase();
                switch (nameAdmin){
                    case "alex":
                        System.out.println("Hello! this is Alex. How can I help you?");
                        break;
                    case" jessie":
                        System.out.println("Hello this is Jessie. How can I help you?");
                        break;
                    default:
                        System.out.println("We don't have "+ nameAdmin.toUpperCase());
                }
                break;
            case 3:
                System.out.println("You are in Customer Care dept. Who do You want to speak with? Please enter name: Zack, Ana and John");
                scanner = new Scanner(System.in);
                String nameCC = scanner.nextLine().toLowerCase();
                switch (nameCC){
                    case "zack":
                        System.out.println("Hello this is Zack");
                        break;
                    case "ana":
                        System.out.println("Hello! this is Ana. How can I help you?");
                        break;
                    case "john":
                        System.out.println("Hello! This is John. How can I help you?");
                        break;
                    default:
                        System.out.println("We don't have "+ nameCC);
                        break;

                }
                break;

            default:
                System.out.println("We have only 3 departments");




        }

    }
}
