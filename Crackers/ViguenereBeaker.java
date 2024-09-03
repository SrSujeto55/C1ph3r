package Crackers;

import Crackers.utils.FrequencyAlphabeth;

public class ViguenereBeaker {
    public static void alphaberAnalizer(int keyLength, String text){
        text = text.toLowerCase().strip();
        text = text.replaceAll(" ", "")
                    .replaceAll("\\s+", "");
        char[] textArray = text.toCharArray();
        StringBuilder[] keyStrings = new StringBuilder[keyLength];

        // Initialize the array of strings, each string is one alphabeth acording to a keychar position
        for (int i = 0; i < keyLength; i++) {
            keyStrings[i] = new StringBuilder();
        }

        // Fill the strings with the characters of the text
        for (int i = 0; i < textArray.length; i++) {
            keyStrings[i % keyLength].append(textArray[i]);
        }

        // Print the strings
        for (int i = 0; i < keyLength; i++) {
            System.out.println("Alphabet " + (i + 1) + ": " + keyStrings[i]);
        }

        // Print the frequency of each character in each string
        for (int i = 0; i < keyLength; i++) {
            System.out.println("Frequency of alphabet " + (i + 1) + ": ");
            FrequencyAlphabeth.frequencyThree(keyStrings[i].toString());
        }
    }
}
