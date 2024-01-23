package com.tns.assign2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Get three numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Create NumberGame object with user input
        NumberGame numberGame = new NumberGame(num1, num2, num3);

        // Find and print the smallest number
        int smallest = numberGame.findSmallest();
        System.out.println("The smallest number is: " + smallest);

        // Check if all three numbers are equal
        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal.");
        }

        // Close the scanner
        scanner.close();
    }

	}


