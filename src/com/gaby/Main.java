/*Assignment 6

Question 1: This program needs input validation. 
What else is wrong with it? (hint - can you see any repetition?) 
		Please improve this program. Your improved version should use function(s).*/

//next, Create a Coffee class and use it to improve 
//the structure, conciseness, clarity, and organization of your program.

package com.gaby;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Coffee Shop Sales Calculator Program");

        double totalSales = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many cups of coffee did you sell today?");
        int cups = scanner.nextInt();
        System.out.println("What does a cup of coffee cost?");
        double price = scanner.nextDouble();
        double drinkSales = price * cups;
        totalSales = totalSales + drinkSales;

        System.out.println("How many cups of hot chocolate did you sell today?");
        cups = scanner.nextInt();
        System.out.println("What does a cup of hot chocolate cost?");
        price = scanner.nextDouble();
        drinkSales = price * cups;
        totalSales = totalSales + drinkSales;

        System.out.println("How many cups of tea did you sell today?");
        cups = scanner.nextInt();
        System.out.println("What does a cup of tea cost?");
        price = scanner.nextDouble();
        drinkSales = price * cups;
        totalSales = totalSales + drinkSales;

        System.out.println("How many cups of cappuccino did you sell today?");
        cups = scanner.nextInt();
        System.out.println("What does a cup of cappuccino cost?");
        price = scanner.nextDouble();
        drinkSales = price * cups;
        totalSales = totalSales + drinkSales;

        System.out.println("Total sales for the day are $"  + totalSales);

    }
}
