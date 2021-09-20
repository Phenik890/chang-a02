import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hunter Chang
 */

public class Solution18 {
    static double celsius(double f)
    {
        return  (f - 32) * 5/9;
    }

    static double fahrenheit(double c) {
        return  (c * 9/5) + 32;
    }

    public static void main(String[] args) {
        exercise18();
    }

    public static void exercise18() {
        int temperature;

        Scanner input = new Scanner(System.in);

        System.out.printf("Press C to convert from Fahrenheit to Celsius.\n");
        System.out.printf("Press F to convert from Celsius to Fahrenheit.\n");
        System.out.printf("Your choice: ");
        char choice = input.next().charAt(0);

        if (choice == 'C') {
            System.out.printf("Please enter the temperature in Fahrenheit: ");
            temperature = input.nextInt();
            System.out.printf("The temperature in Celsius is %.0f", celsius(temperature));
        }

        else {
            System.out.printf("Please enter the temperature in Celsius: ");
            temperature = input.nextInt();
            System.out.printf("The temperature in Fahrenheit is %.0f", fahrenheit(temperature));
        }
    }
}