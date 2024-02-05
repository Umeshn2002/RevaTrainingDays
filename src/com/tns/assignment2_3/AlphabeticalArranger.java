package com.tns.assignment2_3;

import java.util.Scanner;

class AlphabeticalArranger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sentence");
        String sentence = scanner.nextLine();

        SentenceArranger sentenceArranger = new SentenceArranger();
        sentenceArranger.arrangeAlphabetically(sentence);
    }
}