package com.tns.assignpart2;

class BookingProcessor {
    public String processBooking(String input) {
        String[] details = input.split(":");

        String customerName = details[0];
        int numAdults = Integer.parseInt(details[1]);
        int numChildren = Integer.parseInt(details[2]);
        int numDays = Integer.parseInt(details[3]);

        if (numAdults < 0) {
            return "Invalid input for number of adults";
        }

        if (numChildren < 0) {
            return "Invalid input for number of children";
        }

        if (numDays <= 0) {
            return "Invalid input for number of days";
        }

        int totalCost = calculateTotalCost(numAdults, numChildren, numDays);
        return customerName + " your booking is confirmed and the total cost is " + totalCost;
    }

    private int calculateTotalCost(int numAdults, int numChildren, int numDays) {
        int adultCost = numAdults * 1000;
        int childCost = numChildren * 650;

        return (adultCost + childCost) * numDays;
    }
}