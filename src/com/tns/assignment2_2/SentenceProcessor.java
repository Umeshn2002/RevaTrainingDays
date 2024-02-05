package com.tns.assignment2_2;

class SentenceProcessor {
    public void checkWordPresence(String sentence, String word) {
        if (sentence.contains(word)) {
            System.out.println(word + " is present in the sentence");
        } else {
            System.out.println(word + " is not present in the sentence");
        }
    }
}
