import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hunter Chang
 */

public class Solution10 {
    public static void main(String[] args) {
        exercise10();
    }

    public static void exercise10() {
        Scanner input = new Scanner(System.in);     //Declares scanner object

        System.out.print("Enter the price of item 1: ");      //Asks for user input for item 1
        double price1 = input.nextDouble();
        System.out.print("Enter the quantity of item 1: ");
        double quantity1 = input.nextDouble();

        System.out.print("Enter the price of item 2: ");      //Asks for user input for item 2
        double price2 = input.nextDouble();
        System.out.print("Enter the quantity of item 2: ");
        double quantity2 = input.nextDouble();

        System.out.print("Enter the price of item 3: ");      //Asks for user input for item 3
        double price3 = input.nextDouble();
        System.out.print("Enter the quantity of item 3: ");
        double quantity3 = input.nextDouble();

        double subtotal = price1 * quantity1 + price2 * quantity2 + price3 * quantity3;     //Calculates the subtotal of all items
        double tax = subtotal * 0.055;
        double total = subtotal + subtotal*0.055;

        input.close();      //closes scanner

        System.out.printf("Subtotal: %.2f$", subtotal);      //Prints subtotal, tax and total
        System.out.printf("\nTax: %.2f$", tax);
        System.out.printf("\nTotal: %.2f$", total);
    }
}