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

        Scanner input = new Scanner(System.in);
        char choice;

        System.out.print("Is the car silent when you turn the key? ");
        choice = input.next().charAt(0);

        if (choice == 'y') {
            System.out.print("Are the Battery terminals corroded? ");
            choice = input.next().charAt(0);
            if (choice == 'y')
                System.out.println("Clean the terminals and try starting again.");

            else
                System.out.println("Replace cables and try again.");
        }

        else {
            System.out.print("Does the car make a slicking noise? ");
            choice = input.next().charAt(0);

            if (choice == 'y')
                System.out.println("Replace the Battery.");

            else {
                System.out.print("Does the car crank up but fail to start? ");
                choice = input.next().charAt(0);

                if (choice == 'y')
                    System.out.println("Check spark plug connection.");

                else {
                    System.out.print("Does the engine start and then die? ");
                    choice = input.next().charAt(0);

                    if (choice == 'y') {
                        System.out.println("Does your car have fuel injection? ");
                        choice = input.next().charAt(0);

                        if (choice == 'y')
                            System.out.println("Get in it for service.");

                        else
                            System.out.println("Check to ensure the choke is opening and closing.");
                    }

                    else {
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
}