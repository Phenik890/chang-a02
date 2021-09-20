import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hunter Chang
 */

public class Solution08 {
    public static void main(String[] args) {
        exercise08();
    }

    public static void exercise08() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many people? ");
        int numberOfPeople = input.nextInt();

        System.out.print("How many pizzas do you have? ");
        int numberOfPizzas = input.nextInt();

        System.out.print("How many slices of pizza? ");
        int numberOfSlices = input.nextInt();

        int totalSlices = numberOfPizzas * numberOfSlices;

        System.out.println(""+ numberOfPeople +" people with "+ numberOfPizzas +" pizzas ("+ totalSlices +" slices)");
        int slicesPerPerson = totalSlices / numberOfPeople;

        System.out.println("Each person gets "+ slicesPerPerson +" pieces of pizza.");
        int remainder = totalSlices % numberOfPeople;

        input.close();      //closes scanner

        System.out.println("There are "+ remainder +" leftover pieces.");
    }
}