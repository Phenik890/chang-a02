import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hunter Chang
 */

public class Solution14 {
    public static void main(String[] args) {
        exercise14();
    }

    public static void exercise14() {
        double tax;

        Scanner input = new Scanner(System.in);

        System.out.print("What is the order amount? ");     //Print asks user for order amount
        double orderAmount = input.nextDouble();

        System.out.print("What is the state? ");        //Print asks user for state
        String state = input.next();

        input.close();

        if(state.equalsIgnoreCase("WI")) {      //If/else determining what the tax is based on state
            System.out.printf("The subtotal is $%.2f", orderAmount);      //Prints subtotal

            tax = 0.55;
            System.out.printf("The tax is $%.2f", tax);       //Prints tax

            double total = orderAmount + tax;       //Calculates the total from order amount and tax

            System.out.printf("The total is $%.2f", total);     //Prints total

        }

        else {
            System.out.printf("The total is $%.2f", orderAmount);     //Prints total
        }
    }
}