package Crackers.utils;

public class CharKeyGen {

    public static char viguenereCharMap(String text, char mostCommonLetterLenguage){
        mostCommonLetterLenguage = Character.toLowerCase(mostCommonLetterLenguage);
        text = text.toLowerCase().strip();
        text = text.replaceAll(" ", "")
                    .replaceAll("\\s+", "");
        Character common = FrequencyAlphabeth.frequencyFirst(text, false).getKey();
        common = Character.toLowerCase(common);
        int shift = (common - mostCommonLetterLenguage + 26) % 26; 
        return (char) ('a'+shift);
    }
}
