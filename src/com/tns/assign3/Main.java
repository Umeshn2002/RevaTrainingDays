package com.tns.assign3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Get two numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Create NumberSwapper object with user input
        NumberSwapper numberSwapper = new NumberSwapper(num1, num2);

        // Swap the numbers
        numberSwapper.swapNumbers();

        // Print the swapped numbers
        System.out.println("After swapping:");
        System.out.println("First number: " + numberSwapper.getFirstNumber());
        System.out.println("Second number: " + numberSwapper.getSecondNumber());

        // Close the scanner
        scanner.close();
    }
	}

