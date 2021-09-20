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
        Scanner input = new Scanner(System.in);

        int orderAmount;
        double total;
        double tax;

        System.out.print("What is order amount? ");
        orderAmount = input.nextInt();

        System.out.print("What state do you live in? ");
        String state = input.next();

        if (state.equals("Wisconsin")) {
            System.out.print("What county do you live in? ");
            String county = input.next();

            if (county.equals("EauClaire")) {
                tax = (orderAmount*5.005)/100;
                total = tax + orderAmount;
            }

            else if (county.equals("Dunn")) {
                tax = (orderAmount*5.004)/100;
                total = tax + orderAmount;
            }

            else {
                tax = (orderAmount*5.0)/100;
                total = tax + orderAmount;
            }

        }
        else if (state.equals("Illinois")) {
            tax = (orderAmount*8.0)/100;
            total = tax + orderAmount;
        }

        else {
            tax = 0;
            total = orderAmount;
        }

        System.out.println("The tax is  $"+String.format("%.2f",tax)+"\nThe total is  $"+String.format("%.2f",total));
    }
}