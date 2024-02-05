package com.tns.assignment2_3;

class SentenceArranger {
    public void arrangeAlphabetically(String sentence) {
        if (isValidInput(sentence)) {
            String[] words = sentence.split("\\s+");

            for (String word : words) {
                String sortedWord = sortAlphabetically(word);
                System.out.print(sortedWord + " ");
            }
        } else {
            System.out.println(sentence + " is an invalid input");
        }
    }

    private boolean isValidInput(String sentence) {
        return sentence.matches("[a-z\\s]+");
    }

    private String sortAlphabetically(String word) {
        char[] chars = word.toCharArray();
        java.util.Arrays.sort(chars);
        return new String(chars);
    }
}
