package Ciphers.utils;

public class Rotator {
    private final int ALPHABET_SIZE = 26;
    private final int ALPHABET_START = 97;
    private final int ALPHABET_END = 122;
    private int displacement;

    public Rotator(int displacement){
        this.displacement = displacement % 26;
    }

    public String simpleRotateText(char[] plainText){
        String rotatedText = "";
        int shift = 0;
        for (int i = 0; i < plainText.length; i++){
            if (plainText[i] == 32) {
                rotatedText += " ";
                continue;
            }; // ignore spaces
            if (plainText[i] < ALPHABET_START || plainText[i] > ALPHABET_START + ALPHABET_SIZE) {
                rotatedText += (char) plainText[i];
                continue;
            }; // ignore non-alphabet characters
            shift = (plainText[i] + displacement - ALPHABET_START) % ALPHABET_SIZE;
            rotatedText += (char) (ALPHABET_START + shift);
        }
        return rotatedText;
    }


    public String simpleUnrotateText(char[] plainText){
        String rotatedText = "";
        int shift = 0;
        for (int i = 0; i < plainText.length; i++){
            if (plainText[i] == 32) {
                rotatedText += " ";
                continue;
            }; // ignore spaces
            if (plainText[i] < ALPHABET_START || plainText[i] > ALPHABET_START + ALPHABET_SIZE) {
                rotatedText += (char) plainText[i];
                continue;
            }; // ignore non-alphabet characters
            shift = (ALPHABET_END - plainText[i] + displacement) % ALPHABET_SIZE;           
            rotatedText += (char) (ALPHABET_END - shift);
        }
        return rotatedText;
    }
}
