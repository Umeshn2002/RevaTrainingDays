package com.tns.assignment2_2;

import java.util.Scanner;

class SentenceChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sentence");
        String sentence = scanner.nextLine();

        System.out.println("Enter the word");
        String word = scanner.nextLine();

        SentenceProcessor sentenceProcessor = new SentenceProcessor();
        sentenceProcessor.checkWordPresence(sentence, word);
    }
}
