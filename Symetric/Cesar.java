package Symetric;

public class Cesar {
    Rotator rotator;

    public Cesar(int displacement){
        rotator = new Rotator(displacement % 26, 1);
    }

    public String encrypt(String param) {
        String plainText = param.toLowerCase(); // Cleaning input
        plainText = plainText.strip(); // Cleaning input

        char[] charPlainText = plainText.toCharArray();
        return rotator.simpleRotateText(charPlainText);
    }

    public String decrypt(String param) {
        String plainText = param.toLowerCase(); // Cleaning input
        plainText = plainText.strip(); // Cleaning input

        char[] charPlainText = plainText.toCharArray();
        return rotator.simpleUnrotateText(charPlainText);
    }
}
