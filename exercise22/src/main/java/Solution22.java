import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hunter Chang
 */

public class Solution22 {
    public static void main(String[] args) {
        exercise22();
    }

    public static void exercise22() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the first number: ");
        int number2 = input.nextInt();

        System.out.print("Enter the first number: ");
        int number3 = input.nextInt();

        if (number1 >= number2 && number1 >= number3) {
            System.out.println("The largest number is "+ number1 +".");
        }

        else if (number2 >= number1 && number2 >= number3) {
            System.out.println("The largest number is "+ number2 +".");
        }

        else {
            System.out.println("The largest number is "+ number3 +".");
        }
    }
}