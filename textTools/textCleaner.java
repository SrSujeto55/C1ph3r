package textTools;

import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.regex.Pattern;

public class textCleaner {
    public static char[] cleanUpperChars(String text){
        text = Normalizer.normalize(text, Form.NFD);
        text = Pattern.compile("\\p{M}").matcher(text).replaceAll("");
        text = text.replaceAll("[.,;\n]", "");
        return text.toUpperCase().toCharArray();
    }

    public static char[] cleanChars(String text){
        text = Normalizer.normalize(text, Form.NFD);
        text = Pattern.compile("\\p{M}").matcher(text).replaceAll("");
        text = text.replaceAll("[.,;\n]", "");
        return text.toCharArray();
    }

    public static String cleanText(String text){
        text = Normalizer.normalize(text, Form.NFD);
        text = Pattern.compile("\\p{M}").matcher(text).replaceAll("");
        text = text.replaceAll("[.,;\n]", "");
        return text;
    }
}
