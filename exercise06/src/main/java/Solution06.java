import java.util.*;

public class Solution06 {

    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution
     *  Copyright 2021 Hunter Chang
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   //takes user input using a scanner

        int current_year = Calendar.getInstance().get(Calendar.YEAR);

        System.out.print("What is your current age? ");       //asks user for age
        int age = input.nextInt();

        System.out.print("At what age would you like to retire? ");       //asks user for age of retirement
        int retirement = input.nextInt();

        input.close();      //closes scanner

        int difference = retirement - age;                   //formula to figure out the years left till retirement
        System.out.println("You have " + difference + " years left until you can retire.");   //prints years left

        int retirementYear = current_year + difference;       //formula to figure out which year they should retire
        System.out.println("It's " + current_year + ", so you can retire in " + retirementYear + ".");

    }
}

