// import Classic.Cesar;
// import Crackers.FrequencyAnalyzer;

import Ciphers.Viguenere;
import Crackers.FrequencyAnalyzer;
import Crackers.ViguenereBeaker;
import Crackers.utils.CoincidenceAnalizer;
import Crackers.utils.FrequencyAlphabeth;
import textTools.textParser;

public class Main {
    public static void main(String[] args) {
        // // Cesar example
        // Cesar cesar = new Cesar(1);   
        // String text = "Hello World";
        // System.out.println(cesar.encrypt(text));
        // System.out.println(cesar.decrypt(cesar.encrypt(text)));
        // System.out.println(cesar.decrypt("Ifmmp Xpsme"));

        // Winner Alphabeth (Frequency Analisis example)
        // char[] spanishFrequencyAlphabeth = {'a', 'e','s', 'o', 'i', 'n', 'r', 'l', 'c', 't', 'd', 'm', 'u', 'p', 'y', 'v','h', 'f', 'b', 'g', 'w', 'k', 'x', 'j', 'q', 'z'};
        // String text = textParser.getText("TextExamples\\frequency.txt");
        // System.out.println(FrequencyAnalyzer.replaceText(text, spanishFrequencyAlphabeth));

        // // Coicidence Index
        // CoincidenceAnalizer coincidenceAnalizer = new CoincidenceAnalizer();
        // coincidenceAnalizer.analize(new textParser("text.txt").getText());

        // FrequencyAlphabeth fas = new FrequencyAlphabeth();
        // fas.frequecyList(text);

        // // Viguenere Beaker
        // String text = textParser.getText("TextExamples\\viguenere.txt");
        // ViguenereBeaker.alphaberAnalizer(10, text);
        // System.out.println(Viguenere.decrypt(text, "SUNTZARTEG"));

    }
}