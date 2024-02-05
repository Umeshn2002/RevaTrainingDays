package com.tns.assignpart2;

import java.util.Scanner;

class BookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the customer details");
        String input = scanner.nextLine();

        BookingProcessor bookingProcessor = new BookingProcessor();
        String result = bookingProcessor.processBooking(input);

        System.out.println(result);
    }
}