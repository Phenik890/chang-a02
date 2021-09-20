import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hunter Chang
 */

public class Solution12 {
    public static void main(String[] args) {
        exercise12();
    }

    public static void exercise12() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal: ");      //Asks for user input for principal
        double p = input.nextDouble();

        System.out.print("Enter the rate of interest: ");      //Asks for user input for interest
        double r = input.nextDouble();

        System.out.print("Enter the number of years: ");      //Asks for user input for years
        double t = input.nextDouble();

        double A = p*(1 +(r*t)/100);      //Calculates the result for interest

        int years=(int)t;      //Creates variables to match decimals length with example output
        int formula = (int)A;

        input.close();      //Closes scanner

        System.out.printf("After %.0f years at %.1f%, the investment will be worth $%.2f.", years, r, formula);      //Prints the results
    }
}