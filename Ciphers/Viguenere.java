package Ciphers;

public class Viguenere {
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String encrypt(String plaintext, String key) {
        StringBuilder ciphertext = new StringBuilder();
        int keyIndex = 0;

        for (char c : plaintext.toCharArray()) {
            if (Character.isLetter(c)) {
                int plainIndex = ALPHABET.indexOf(Character.toUpperCase(c));
                int keyChar = ALPHABET.indexOf(Character.toUpperCase(key.charAt(keyIndex)));

                int encryptedIndex = (plainIndex + keyChar) % ALPHABET.length();
                char encryptedChar = ALPHABET.charAt(encryptedIndex);

                ciphertext.append(Character.isUpperCase(c) ? encryptedChar : Character.toLowerCase(encryptedChar));

                keyIndex = (keyIndex + 1) % key.length();
            } else {
                ciphertext.append(c);
            }
        }

        return ciphertext.toString();
    }

    public static String decrypt(String ciphertext, String key) {
        StringBuilder plaintext = new StringBuilder();
        int keyIndex = 0;

        for (char c : ciphertext.toCharArray()) {
            if (Character.isLetter(c)) {
                int encryptedIndex = ALPHABET.indexOf(Character.toUpperCase(c));
                int keyChar = ALPHABET.indexOf(Character.toUpperCase(key.charAt(keyIndex)));

                int plainIndex = (encryptedIndex - keyChar + ALPHABET.length()) % ALPHABET.length();
                char plainChar = ALPHABET.charAt(plainIndex);

                plaintext.append(Character.isUpperCase(c) ? plainChar : Character.toLowerCase(plainChar));

                keyIndex = (keyIndex + 1) % key.length();
            } else {
                plaintext.append(c);
            }
        }

        return plaintext.toString();
    }
}
