import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hunter Chang
 */

public class Solution09 {
    public static void main(String[] args) {
        exercise09();
    }

    public static void exercise09() {
        Scanner input = new Scanner(System.in);     //Declares scanner object
        double squareFeetPerGallon = 350;       //Declares the square feet per gallon

        System.out.print("Enter length: ");     //Asks for user input for length
        double length = input.nextDouble();

        System.out.print("Enter width: ");      //Asks for user input for width
        double width = input.nextDouble();

        double squareFeet = length*width;      //Calculates square feet from user input

        int gallons = (int)Math.ceil(squareFeet/squareFeetPerGallon); //calculate number of gallon

        input.close();      //closes scanner

        System.out.printf("You will need to purchase "+ gallons +" of paint to cover %.0f square feet.", squareFeet);        //Prints the calculations
    }
}