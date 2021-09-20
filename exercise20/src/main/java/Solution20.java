import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hunter Chang
 */

public class Solution20 {
    public static void main(String[] args) {
        exercise20();
    }

    public static void exercise20() {
        Scanner input = new Scanner(System.in);     //creates scanner

        int orderAmount;        //declares variables
        double total;
        double tax;

        System.out.print("What is order amount? ");     //print asks for input for order amount
        orderAmount = input.nextInt();

        System.out.print("What state do you live in? ");        //print asks for input for state
        String state = input.next();

        if (state.equals("Wisconsin")) {        //if/else determines which state the user is in from input
            System.out.print("What county do you live in? ");       //print asks for input about county if in wisconsin
            String county = input.next();

            if (county.equals("EauClaire")) {       //If calculation for when county is EauClaire
                tax = (orderAmount*5.005)/100;
                total = tax + orderAmount;
            }

            else if (county.equals("Dunn")) {       //Else if calculation for when county is Dane
                tax = (orderAmount*5.004)/100;
                total = tax + orderAmount;
            }

            else {      //Else calculation for when the user is in any other county besides the two
                tax = (orderAmount*5.0)/100;
                total = tax + orderAmount;
            }

        }
        else if (state.equals("Illinois")) {        //Else if calculation when state is in Illinois
            tax = (orderAmount*8.0)/100;
            total = tax + orderAmount;
        }

        else {      //Else calculation for when user is in any other state besides the two
            tax = 0;
            total = orderAmount;
        }

        //Print line result of calculations based on user input
        System.out.println("The tax is  $"+String.format("%.2f",tax)+"\nThe total is  $"+String.format("%.2f",total));
    }
}