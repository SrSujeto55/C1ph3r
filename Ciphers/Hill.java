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

    public static String encrypt(String text, int[] key, boolean mod27){
        if(!MatrixMod.isInvertible2x2(key, mod27 ? 27 : 26)){
            System.out.println("The key is not invertible");
            return "";
        }

        text = textCleaner.cleanText(text);
        String[] digrams = digrams(text);
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < digrams.length; i++){
            int[] numbers = digramToNumbers(digrams[i], mod27 ? alphabeth27 : alphabeth26);
            int[] encryptedNumbers = MatrixMod.multiplyDigramMod2x2(key, numbers, mod27 ? 27 : 26);
            encryptedText.append(mod27 ? alphabeth27.charAt(encryptedNumbers[0]) : alphabeth26.charAt(encryptedNumbers[0]));
            encryptedText.append(mod27 ? alphabeth27.charAt(encryptedNumbers[1]) : alphabeth26.charAt(encryptedNumbers[1]));
            encryptedText.append(" ");
        }
        return encryptedText.toString();
    }

    public static String decrypt(String text, int[] key, boolean mod27){
        if(!MatrixMod.isInvertible2x2(key, mod27 ? 27 : 26)){
            System.out.println("The key is not invertible");
            return "";
        }
        int[] invertKey = MatrixMod.inverted2x2(key, mod27 ? 27 : 26);

        String[] digrams = digrams(text);
        StringBuilder decryptedText = new StringBuilder();
        for (int i = 0; i < digrams.length; i++){
            int[] numbers = digramToNumbers(digrams[i], mod27 ? alphabeth27 : alphabeth26);
            int[] decryptedNumbers = MatrixMod.multiplyDigramMod2x2(invertKey, numbers, mod27 ? 27 : 26);
            decryptedText.append(mod27 ? alphabeth27.charAt(decryptedNumbers[0]) : alphabeth26.charAt(decryptedNumbers[0]));
            decryptedText.append(mod27 ? alphabeth27.charAt(decryptedNumbers[1]) : alphabeth26.charAt(decryptedNumbers[1]));
            decryptedText.append(" ");
        }
        return decryptedText.toString();
    }

    public static void decryptHint(String text, int[] key, boolean mod27){
        if(!MatrixMod.isInvertible2x2(key, mod27 ? 27 : 26)){
            System.out.println("The key is not invertible");
        }
        int[] invertKey = MatrixMod.inverted2x2(key, mod27 ? 27 : 26);

        String[] digrams = digrams(text);
        StringBuilder decryptedText = new StringBuilder();
        for (int i = 0; i < 6; i++){
            int[] numbers = digramToNumbers(digrams[i], mod27 ? alphabeth27 : alphabeth26);
            int[] decryptedNumbers = MatrixMod.multiplyDigramMod2x2(invertKey, numbers, mod27 ? 27 : 26);
            decryptedText.append(mod27 ? alphabeth27.charAt(decryptedNumbers[0]) : alphabeth26.charAt(decryptedNumbers[0]));
            decryptedText.append(mod27 ? alphabeth27.charAt(decryptedNumbers[1]) : alphabeth26.charAt(decryptedNumbers[1]));
            decryptedText.append(" ");
        }
        if(decryptedText.toString().replaceAll("\\s+", "").charAt(4) != 'E'){
            return;
        }
        for (int i = 6; i < digrams.length; i++){
            int[] numbers = digramToNumbers(digrams[i], mod27 ? alphabeth27 : alphabeth26);
            int[] decryptedNumbers = MatrixMod.multiplyDigramMod2x2(invertKey, numbers, mod27 ? 27 : 26);
            decryptedText.append(mod27 ? alphabeth27.charAt(decryptedNumbers[0]) : alphabeth26.charAt(decryptedNumbers[0]));
            decryptedText.append(mod27 ? alphabeth27.charAt(decryptedNumbers[1]) : alphabeth26.charAt(decryptedNumbers[1]));
            decryptedText.append(" ");
        }
        String decrypted = decryptedText.toString().replaceAll("\\s+", "");
        if (decrypted.charAt(decrypted.length()-2) == 'S'){
            System.out.println(decrypted);
            System.out.println("Decripted Key: ");
            MatrixMod.print(key, 2);
            System.out.println("-------------------------------DECRIPTED-------------------------------");
        }
        return;
    }
}
