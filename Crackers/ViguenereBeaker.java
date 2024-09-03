package Crackers;

import Crackers.utils.FrequencyAlphabeth;

public class ViguenereBeaker {
    public void alphaberAnalizer(int keyLength, String text){
        text = text.toLowerCase().strip();
        text = text.replaceAll(" ", "")
                    .replaceAll("\\s+", "");
        char[] textArray = text.toCharArray();
        String[] keyStrings = new String[keyLength];

        // Initialize the array of strings, each string is one alphabeth acording to a keychar position
        for (int i = 0; i < keyLength; i++) {
            keyStrings[i] = "";
        }

        // Fill the strings with the characters of the text
        for (int i = 0; i < textArray.length; i++) {
            keyStrings[i % keyLength] += textArray[i];
        }

        // Print the strings
        for (int i = 0; i < keyLength; i++) {
            System.out.println("Alphabet " + (i + 1) + ": " + keyStrings[i]);
        }

        // Print the frequency of each character in each string
        for (int i = 0; i < keyLength; i++) {
            System.out.println("Frequency of alphabet " + (i + 1) + ": ");
            new FrequencyAlphabeth().frequencyThree(keyStrings[i]);
        }
    }
}
