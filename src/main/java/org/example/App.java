/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Brendon Murphy
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        //input
        System.out.println("Enter a noun: ");
        Scanner input = new Scanner(System.in);
        String nounInput = input.nextLine();
        System.out.println( "Enter a verb: ");
        String verbInput = input.nextLine();
        System.out.println("Enter an adjective: ");
        String adjInput = input.nextLine();
        System.out.println("Enter an adverb: ");
        String advInput = input.nextLine();

        //output
        System.out.println(String.format("Will you %s with your %s %s %s today? I'd love to join in!", verbInput, adjInput, nounInput, advInput));
    }
}
