import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hunter Chang
 */

public class Solution16 {
    public static void main(String[] args) {
        exercise16();
    }

    public static void exercise16() {
        int age;

        Scanner input= new Scanner(System.in); //Creates Scanner

        System.out.print("What is your age? ");  //Asks for user input for age
        age = input.nextInt();

        if(age >= 16)     //If/else statement where if age is >= 16 you can drive and prints as so
            System.out.println("You are old enough to legally drive.");      //If true prints...

        else               //If false prints...
            System.out.println("You are not old enough to legally drive.");
    }
}