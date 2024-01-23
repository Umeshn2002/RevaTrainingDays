package com.tns.assign1;

import java.util.Scanner;

public class SkyAirlines {

	public static void main(String[] args) {
		 // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Get customer details
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter source: ");
        String source = scanner.nextLine();

        System.out.print("Enter destination: ");
        String destination = scanner.nextLine();

        // Create Customer object with user input
        Customer customer = new Customer(name, source, destination);

        // Print the message
        printMessage(customer);

        // Close the scanner
        scanner.close();
    }

    // Method to print the message
    private static void printMessage(Customer customer) {
        System.out.println("\nDear " + customer.getName() + ",");
        System.out.println("Welcome onboard with service");
        System.out.println("Source: " + customer.getSource());
        System.out.println("Destination: " + customer.getDestination());
        System.out.println("Thank you for choosing Sky airlines. Enjoy your flight");
    }

	}


