/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Colin Mitchell
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.print("What is the input string? ");
        Scanner input = new Scanner(System.in);

        String input_string = input.nextLine();
        int input_num = input_string.length();

        System.out.println(input_string + " has " + input_num + " characters.");
    }
}
