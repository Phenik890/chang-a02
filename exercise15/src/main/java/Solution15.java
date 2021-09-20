import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hunter Chang
 */

public class Solution15 {
    public static void main(String[] args) {
        exercise15();
    }

    public static void exercise15() {
        String password  = "abc$123";   //Declares variable password

        Scanner input = new Scanner(System.in);    //Creates Scanner

        System.out.print("What is the password ? : ");      //Asks for user input for password
        String inputPassword = input.next();

        input.close();

        if(inputPassword.equals(password)) //If/else statement to determine is the password is true
        {
            System.out.println("Welcome!");     //If true prints...
        }
        else
        {
            System.out.println("I don't know you.");        //If False prints...
        }
    }
}