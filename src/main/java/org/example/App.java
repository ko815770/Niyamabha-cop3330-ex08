package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
public class App
{
    public static void main( String[] args )

    {
        int people, pizzanum, slice, leftover = 0, divide;
        System.out.println("How many people?");
        Scanner input = new Scanner(System.in);
        people = input.nextInt();
        System.out.println( "How many pizzas do you have?" );
        pizzanum = input.nextInt();
        System.out.println("How many slices per pizza?");
        slice = input.nextInt();
        System.out.println(people + " people with " + pizzanum + " pizzas (" + (slice * pizzanum) + " slices)");
        divide = (slice * pizzanum) / people;
        leftover = (slice * pizzanum) % people;
        System.out.println("Each person gets " + divide + " pieces of pizza.");
        System.out.println("There are " + leftover + " leftover pieces");

    }
}
