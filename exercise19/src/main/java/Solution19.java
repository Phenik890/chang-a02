import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hunter Chang
 */

public class Solution19 {

    static double bmi(double h, double w) {
        return (w / (h * h) * 703);
    }       //Function to calculate BMI

    public static void main(String[] args)
    {
        exercise19();
    }

    public static void exercise19() {
            Scanner input = new Scanner(System.in);     //Creates Scanner

            System.out.print("What is your weight in pounds: ");        //Print asks for weight in pounds
            double weight = input.nextDouble();

            System.out.print("What is your height in inches: ");        //Print asks for height in inches
            double heightInInches = input.nextDouble();

            double BMI = bmi(heightInInches, weight);       //Creates variable that calls a function to calculate BMI

            System.out.printf("Your BMI is %.1f\n", BMI);       //Prints result
        if (BMI >= 18.5 && BMI <= 25) {     //If/else that determines if BMI is below/above or in the ideal weight range
            System.out.print("You are within the ideal weight range");
        }

        else if (BMI < 18.5) {
            System.out.print("You are underweight. You should see your doctor.\n");
        }

        else {
            System.out.print("You are overweight. You should see your doctor.\n");
        }
    }
}