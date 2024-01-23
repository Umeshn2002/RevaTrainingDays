package com.tns.assign2;

public class NumberGame {
	private int number1;
    private int number2;
    private int number3;

    // Constructor
    public NumberGame(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    // Method to find the smallest number
    public int findSmallest() {
        // Use ternary operator to find the smallest number
        int smallest = (number1 <= number2) ? ((number1 <= number3) ? number1 : number3) : ((number2 <= number3) ? number2 : number3);
        return smallest;
    }
}
