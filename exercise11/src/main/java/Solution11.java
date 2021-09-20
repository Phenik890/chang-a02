import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hunter Chang
 */

public class Solution11 {

    private static double dollarConversion(double euros, double exchangeRate) {       //Function converting euros to dollars
        return euros * exchangeRate;       //Returns result
    }

    public static void main(String[] args) {
        exercise11();
    }

    public static void exercise11() {
        Scanner input = new Scanner(System.in);     //Creates scanner

        double result = 0.0;        //Declares variable

        System.out.println("How many euros are you exchanging? ");      //Print asks user for input for euros
        double euros = input.nextDouble();

        System.out.println("What is the exchange rate? ");      //Print asks user for input for exchange rate
        double exchangeRate = input.nextDouble();

        double dollars = dollarConversion(euros, exchangeRate);     //Calculates euros to dollars using a function

        System.out.printf("%.0f euros at an exchange rate of %.4f is \n", euros, exchangeRate);       //Prints exchange rate and conversion to dollars
        System.out.printf("%.2f U.S dollars.", dollars);

        input.close();      //closes scanner
    }
}