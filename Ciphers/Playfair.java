package Ciphers;

import java.util.HashMap;

import Ciphers.utils.MatrixMod;
import textTools.textCleaner;

public class Playfair {

    public static String alphabeth27 = "ABCDEFGHIKLMNOPQRSTUVWXYZ ";
    public static String alphabeth26 = "ABCDEFGHIJKLMNOPQRSTUVXYZ ";

    public static String encrypt(String text, String key) {
        text = textCleaner.cleanText(text).toUpperCase().replaceAll("[^A-ZÑ]", "");
        text = text.replaceAll("J", "I").replaceAll("Ñ", "N");
        key = key.toUpperCase().replaceAll("[^A-ZÑ]", "");

        char[][] table = generateAlphabethTable(key);
        MatrixMod.print(table);
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i += 2) {
            char a = text.charAt(i);
            char b = (i + 1 < text.length()) ? text.charAt(i + 1) : 'X';

            if (a == b) {
                b = 'X';
                i--;
            }
            int[] posA = findPosition(table, a);
            int[] posB = findPosition(table, b);

            if (posA[0] == posB[0]) {
                encryptedText.append(table[posA[0]][(posA[1] + 1) % 5]);
                encryptedText.append(table[posB[0]][(posB[1] + 1) % 5]);
                encryptedText.append(" ");
            } else if (posA[1] == posB[1]) {
                encryptedText.append(table[(posA[0] + 1) % 5][posA[1]]);
                encryptedText.append(table[(posB[0] + 1) % 5][posB[1]]);
                encryptedText.append(" ");
            } else {
                encryptedText.append(table[posA[0]][posB[1]]);
                encryptedText.append(table[posB[0]][posA[1]]);
                encryptedText.append(" ");
            }
        }

        return encryptedText.toString();
    }

    public static String decrypt(String text, String Key) {
        char[][] table = generateAlphabethTable(Key);
        Key = Key.toUpperCase().replaceAll("[^A-ZÑ]", "");
        StringBuilder decryptedText = new StringBuilder();
        text = text.replaceAll(" ", "");

        for (int i = 0; i < text.length(); i += 2) {
            char a = text.charAt(i);
            char b = (i + 1 < text.length()) ? text.charAt(i + 1) : 'X';
            int[] posA = findPosition(table, a);
            int[] posB = findPosition(table, b);

            if (posA[0] == posB[0]) {
                decryptedText.append(table[posA[0]][(posA[1] + 4) % 5]);
                decryptedText.append(table[posB[0]][(posB[1] + 4) % 5]);
            } else if (posA[1] == posB[1]) {
                decryptedText.append(table[(posA[0] + 4) % 5][posA[1]]);
                decryptedText.append(table[(posB[0] + 4) % 5][posB[1]]);
            } else {
                decryptedText.append(table[posA[0]][posB[1]]);
                decryptedText.append(table[posB[0]][posA[1]]);
            }
        }

        return decryptedText.toString();
    }

    public static String decrypt(String text, char[][] AlphabeTable) {
        text = text.replaceAll(" ", "");
        text = text.toUpperCase();
        text = text.replaceAll("W", "I").replaceAll("Ñ", "N");
        text = text.replaceAll("[^A-Z]", "");
        StringBuilder decryptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i += 2) {
            char a = text.charAt(i);
            char b = (i + 1 < text.length()) ? text.charAt(i + 1) : 'X';

            int[] posA = findPosition(AlphabeTable, a);
            int[] posB = findPosition(AlphabeTable, b);

            if (posA[0] == posB[0]) {
                decryptedText.append(AlphabeTable[posA[0]][(posA[1] + 4) % 5]);
                decryptedText.append(AlphabeTable[posB[0]][(posB[1] + 4) % 5]);
            } else if (posA[1] == posB[1]) {
                decryptedText.append(AlphabeTable[(posA[0] + 4) % 5][posA[1]]);
                decryptedText.append(AlphabeTable[(posB[0] + 4) % 5][posB[1]]);
            } else {
                decryptedText.append(AlphabeTable[posA[0]][posB[1]]);
                decryptedText.append(AlphabeTable[posB[0]][posA[1]]);
            }
        }
        return decryptedText.toString();
    }

    public static char[][] generateAlphabethTable(String key) { 
        char[][] table = new char[5][5];
        key = key.toUpperCase();
        key = key + alphabeth27;
        key = key.replaceAll("J", "I").replaceAll("Ñ", "N");
        HashMap<Character, Boolean> map = new HashMap<>();

        int k = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                while(map.containsKey(key.charAt(k))){
                    k++;
                }
                map.put(key.charAt(k), true);
                table[i][j] = key.charAt(k);
            }
        }

        return table;
    }

    private static int[] findPosition(char[][] table, char c) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (table[i][j] == c) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

}