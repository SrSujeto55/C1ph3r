package Ciphers.utils;

public class digram {
    public static String[] digrams(String text){
        text = text.replaceAll("\\s+", "");
        text = text.toUpperCase();
        if(text.length() % 2 != 0) text += "x";
        String[] digrams = new String[text.length()/2];
        for (int i = 0; i < text.length(); i+=2){
            digrams[i/2] = text.substring(i, i+2);
        }
        return digrams;
    }

    public static int[] digramToNumbers(String digram, String alphabeth){
        int[] numbers = new int[2];
        numbers[0] = alphabeth.indexOf(digram.charAt(0));
        numbers[1] = alphabeth.indexOf(digram.charAt(1));
        return numbers;
    }
}
