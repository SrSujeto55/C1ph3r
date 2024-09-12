package Ciphers;

import Ciphers.utils.MatrixMod;
import textTools.textCleaner;

public class Hill {
    public static String alphabeth26 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String alphabeth27 = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ"; 
    
    private static String[] digrams(String text){
        text = text.replaceAll("\\s+", "");
        text = text.toUpperCase();
        if(text.length() % 2 != 0) text += "x";
        String[] digrams = new String[text.length()/2];
        for (int i = 0; i < text.length(); i+=2){
            digrams[i/2] = text.substring(i, i+2);
        }
        return digrams;
    }

    private static int[] digramToNumbers(String digram, String alphabeth){
        int[] numbers = new int[2];
        numbers[0] = alphabeth.indexOf(digram.charAt(0));
        numbers[1] = alphabeth.indexOf(digram.charAt(1));
        return numbers;
    }

    public static String encrypt(String text, int[] key){
        if(!MatrixMod.isInvertible2x2(key, 27)){
            System.out.println("The key is not invertible");
            return "";
        }

        text = textCleaner.cleanText(text);
        String[] digrams = digrams(text);
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < digrams.length; i++){
            int[] numbers = digramToNumbers(digrams[i], alphabeth27);
            int[] encryptedNumbers = MatrixMod.multiplyDigramMod2x2(key, numbers, 27);
            encryptedText.append(alphabeth27.charAt(encryptedNumbers[0]));
            encryptedText.append(alphabeth27.charAt(encryptedNumbers[1]));
            encryptedText.append(" ");
        }
        return encryptedText.toString();
    }

    public static String decrypt(String text, int[] key){
        if(!MatrixMod.isInvertible2x2(key, 27)){
            System.out.println("The key is not invertible");
            return "";
        }
        int[] invertKey = MatrixMod.inverted2x2(key, 27);

        String[] digrams = digrams(text);
        StringBuilder decryptedText = new StringBuilder();
        for (int i = 0; i < digrams.length; i++){
            int[] numbers = digramToNumbers(digrams[i], alphabeth27);
            int[] decryptedNumbers = MatrixMod.multiplyDigramMod2x2(invertKey, numbers, 27);
            decryptedText.append(alphabeth27.charAt(decryptedNumbers[0]));
            decryptedText.append(alphabeth27.charAt(decryptedNumbers[1]));
            decryptedText.append(" ");
        }
        return decryptedText.toString();
    }
}
