/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Spenser Tacinelli
 */

import java.util.Scanner;

public class Exercise_16{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your age? ");
        String temp_age = scanner.nextLine();
        int age = Integer.parseInt(temp_age);

        String output = (age >= 16) ? "You are old enough to legally drive." : "You are not old enough to drive.";
        System.out.println(output);
    }
}