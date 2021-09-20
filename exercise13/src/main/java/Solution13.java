import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hunter Chang
 */

public class Solution13 {
    public static void main(String[] args) {
        exercise13();
    }

    public static void exercise13() {
        double A;       //Declares variable

        Scanner input = new Scanner(System.in);

        System.out.print("What is the principal?: ");      //Asks for user input for principal
        double p = input.nextDouble();

        System.out.print("What is the rate?: ");      //Asks for user input for interest
        double r = input.nextDouble();

        System.out.print("What is the number of years?: ");      //Asks for user input for years
        double t = input.nextDouble();

        System.out.print("What is the number of times the interest is compounded per year?: ");      //Asks for user input for times compounded annually
        double n = input.nextDouble();

        A = p*Math.pow(1+((r*0.01)/n),n*t);      //Calculates the result for interest

        input.close();      //Closes scanner

        System.out.printf("%.2f invested at %.1f% for %.0f years compounded %.0f times per year is $%.2f.", p, r, t, n, A);      //Prints the results
    }
}