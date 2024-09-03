package Crackers;

import java.util.InputMismatchException;
import java.util.Scanner;

import Ciphers.Viguenere;
import Crackers.utils.CharKeyGen;
import Crackers.utils.CoincidenceAnalizer;
import Crackers.utils.FrequencyAlphabeth;

public class ViguenereBeaker {
    private StringBuilder[] alphaberAnalizer(int keyLength, String text){
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
        System.out.println("-----------------Alphabets-----------------");
        for (int i = 0; i < keyLength; i++) {
            System.out.println("Alphabet " + (i + 1) + ": " + keyStrings[i]);
        }
        System.out.println("-----------------Alphabets-----------------\n");


        // Print the frequency of each character in each string
        for (int i = 0; i < keyLength; i++) {
            System.out.println("Frequency of alphabet " + (i + 1) + ": ");
            FrequencyAlphabeth.frequencyThree(keyStrings[i].toString(), true);
        }

        return keyStrings;
    }

    public void breakKey(String text){
        CoincidenceAnalizer.analize(text, true);
        
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Length of the key with Kasiski: >>> ");
            int keyLength = scanner.nextInt();
            StringBuilder[] alphabetStrings = alphaberAnalizer(keyLength, text);

            StringBuilder key = new StringBuilder();
            for (StringBuilder str : alphabetStrings){
                key.append(CharKeyGen.viguenereCharMap(str.toString(), 'e'));
            }
            System.out.println("---------------PROVITIONAL KEY---------------\n");
            System.out.println(key.toString().toUpperCase() + "\n");
            System.out.println("---------------PROVITIONAL KEY---------------\n");

            System.out.println("---------------DECRYPTED TEXT ATTEMP---------------\n");
            System.out.println(Viguenere.decrypt(text, key.toString().toUpperCase()));
            System.out.println("---------------DECRYPTED TEXT ATTEMP---------------\n");

            scanner.close();
        }catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}
