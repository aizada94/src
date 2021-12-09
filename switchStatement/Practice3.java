package switchStatement;

import java.util.Scanner;

public class Practice3 {
    /* ask user for name of geometrical shape
    Based on the name of shape
    calculate the area of that shape
    get length and width for rectangle and
     get height and base for triangle from user to use them in the calculations
    print out name of the shape and area of that shape
    -triangle, rectangle
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which shape you want to calculate area of? Triangle or rectangle");
        String shape = sc.nextLine().toLowerCase();
        switch (shape){
            case "triangle":
                System.out.println("Please enter the height of  triangle");
                double heigth = sc.nextDouble();
                System.out.println("Please enter the base of triangle");
                double base = sc.nextDouble();
                System.out.println("The area of triangle is: " + (base*heigth)/2);
                break;
            case "rectangle":
                System.out.println("Please enter the length of rectangle");
                double length = sc.nextDouble();
                System.out.println("Please enter the width of rectangle");
                double width = sc.nextDouble();
                System.out.println("The area of rectangle is: " + length*width);
                break;
            default:
                System.out.println("Your shape selection is not an option for us. Sorry!");


        }
    }
}
