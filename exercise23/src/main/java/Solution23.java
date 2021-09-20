import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hunter Chang
 */

public class Solution23 {
    public static void main(String[] args) {
        exercise23();
    }

    public static void exercise23() {

        Scanner input = new Scanner(System.in);     //Creates scanner
        char choice;        //declares variable for user input

        System.out.print("Is the car silent when you turn the key? ");      //Print asks if user's car is silent when turning on
        choice = input.next().charAt(0);

        if (choice == 'y') {
            System.out.print("Are the Battery terminals corroded? ");       //based on y/n is asks if the battery corroded
            choice = input.next().charAt(0);
            if (choice == 'y')
                System.out.println("Clean the terminals and try starting again."); //if battery corroded then print solution

            else
                System.out.println("Replace cables and try again.");        //if battery not corroded then print this solution instead
        }

        else {      //if the car is not silent then asks next question
            System.out.print("Does the car make a slicking noise? ");
            choice = input.next().charAt(0);

            if (choice == 'y')      //if yes prints says to replace battery
                System.out.println("Replace the Battery.");

            else {      //if no then asks a new question using prints
                System.out.print("Does the car crank up but fail to start? ");
                choice = input.next().charAt(0);

                if (choice == 'y')      //if car does crank up but fail to start then check spark plug connect
                    System.out.println("Check spark plug connection.");

                else {        //if car does not crank up then print asks a new question
                    System.out.print("Does the engine start and then die? ");
                    choice = input.next().charAt(0);

                    if (choice == 'y') {        //if yes, the engine starts then dies, a new print asks if the car has a fuel injection
                        System.out.println("Does your car have fuel injection? ");
                        choice = input.next().charAt(0);

                        if (choice == 'y')      //if yes, the car has a fuel injection, a print tells the user to get the car service
                            System.out.println("Get in it for service.");

                        else        //if no, the car has no fuel injection then it asks to ensure the choke is opening and closing
                            System.out.println("Check to ensure the choke is opening and closing.");
                    }

                    else {      //if no, the car Starts and dies after saying no to all other question it replies in a print it is not possible
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
}