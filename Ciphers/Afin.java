package Ciphers;

import textTools.textCleaner;

public class Afin {
    public static String alphabeth26 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String alphabeth27 = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";

    public static String encrypt(int beta, int alpha, String text, boolean is27){
        char[] plaintext = textCleaner.cleanUpperChars(text);
        for(int i = 0; i<plaintext.length;i++){
            if (Character.isLetter(plaintext[i])){
                int index = is27 ? alphabeth27.indexOf(plaintext[i]) : alphabeth26.indexOf(plaintext[i]);
                index = is27 ? (index*beta + alpha) % 27 : (index*beta + alpha) % 26;
                plaintext[i] = is27 ? alphabeth27.charAt(index) : alphabeth26.charAt(index);
            }
        }
        return new String(plaintext);
    }

    public static String decrypt(int beta, int alpha, String text, Boolean ClearText, Boolean is27){
        char[] ciphertext = ClearText ? textCleaner.cleanUpperChars(text) : text.toUpperCase().strip().toCharArray();
        for(int i = 0; i<ciphertext.length;i++){
            if(ciphertext[i] == ' '){
                continue;
            }
            int index = is27 ? alphabeth27.indexOf(ciphertext[i]) : alphabeth26.indexOf(ciphertext[i]);
            index = is27 ? (index - alpha) * beta % 27 : (index - alpha) * beta % 26;
            if(index < 0){
                index += is27 ? 27 : 26;
            }
            ciphertext[i] = is27 ? alphabeth27.charAt(index) : alphabeth26.charAt(index);
        }
        
        return new String(ciphertext);
    }
}
