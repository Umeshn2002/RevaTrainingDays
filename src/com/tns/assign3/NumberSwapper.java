package com.tns.assign3;

public class NumberSwapper {
	private int firstNumber;
    private int secondNumber;

    // Constructor
    public NumberSwapper(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    // Method to swap numbers using bitwise XOR operator
    public void swapNumbers() {
        // Use bitwise XOR to swap numbers
        firstNumber = firstNumber ^ secondNumber;
        secondNumber = firstNumber ^ secondNumber;
        firstNumber = firstNumber ^ secondNumber;
    }

    // Getter methods
    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

}
