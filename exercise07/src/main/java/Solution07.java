import java.util.Scanner;

public class Solution07 {

    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution
     *  Copyright 2021 Hunter Chang
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);     //Creates a scanner

        System.out.print("What is the length of the room in feet? ");       // Asks for user input for Length
        double length = input.nextDouble();

        System.out.print("What is the width of the room in feet? ");        //Asks for user input for Width
        double width = input.nextDouble();

        double area = length * width;      //Calculates area using previous user input

        input.close();      //closes scanner

        System.out.printf("You entered dimensions of %.0f feet by %.0f feet.\n", length, width);      //Prints Length and Width in feet
        System.out.printf("The area is\n%.0f square feet\n", area);      //Prints Area in square feet

        area=area/10.764;       //Calculates area into square meters

        System.out.printf("The area is %.3f square meters", area);     //Prints area in square meters

    }
}