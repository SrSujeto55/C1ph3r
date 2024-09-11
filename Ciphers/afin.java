package Ciphers;

public class afin {
    public static String alphabeth = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String encrypt(int beta, int alpha, String text){
        char[] plaintext = text.toUpperCase().strip().toCharArray();
        for(int i = 0; i<plaintext.length;i++){
            int index = (int) plaintext[i];
            plaintext[i] = 
        }
        
        return text;
    }
}
