import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hunter Chang
 */

public class Solution21 {
    public static void main(String[] args) {
        exercise21();
    }

    public static void exercise21() {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of the month: ");
        int numberOfMonth = input.nextInt();
        switch (numberOfMonth) {
            case 1:  System.out.println("The name of the month is January"); break;
            case 2:  System.out.println("The name of the month is February"); break;
            case 3:  System.out.println("The name of the month is March"); break;
            case 4:  System.out.println("The name of the month is April"); break;
            case 5:  System.out.println("The name of the month is May"); break;
            case 6:  System.out.println("The name of the month is June"); break;
            case 7:  System.out.println("The name of the month is July"); break;
            case 8:  System.out.println("The name of the month is August"); break;
            case 9:  System.out.println("The name of the month is September"); break;
            case 10: System.out.println("The name of the month is October"); break;
            case 11: System.out.println("The name of the month is November"); break;
            case 12: System.out.println("The name of the month is December"); break;
        }
    }
}