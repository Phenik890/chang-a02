import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hunter Chang
 */

public class Solution17 {
    public static void main(String[] args) {
        exercise17();
    }

    public static void exercise17() {
        float r;        //Variable declarations
        double BAC;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");       //Print ask user for input for gender
        int g = input.nextInt();

        System.out.print("How many ounces of alcohol did you have? ");      //Print ask user for input for how much alcohol
        int A = input.nextInt();

        System.out.print("What is your weight, in pounds? ");       //Print ask user for input for weight
        int W = input.nextInt();

        System.out.print("How many hours has it been since yours last drink? ");        ////Print ask user for input for how long its been since last drink
        int H = input.nextInt();

        if (g == 1) {           //Calculates ratio for BAC based on gender using if/else
            r = (float) 0.73;
        }

        else {
            r = (float) 0.66;
        }

        BAC = (A * 5.14 / W * r) - (0.015 * H);     //Calculation

        input.close();      //Closes Scanner

        System.out.printf("Your BAC is $%.6f\n", BAC);      //Prints BAC

        if (BAC < 0.08) {       //If/else if it is legal for you to drive based on BAC
            System.out.println("It is legal for you to drive.");
        }

        else {
            System.out.println("It is not legal for you to drive.");
        }
    }
}