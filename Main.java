// import Classic.Cesar;
// import Crackers.FrequencyAnalyzer;

import java.util.InputMismatchException;
import java.util.Scanner;

import Ciphers.Viguenere;
import Ciphers.Afin;
import Crackers.AfinBrute;
import Crackers.FrequencyAnalyzer;
import Crackers.ViguenereBeaker;
import Crackers.utils.CharKeyGen;
import Crackers.utils.CoincidenceAnalizer;
import Crackers.utils.FrequencyAlphabeth;
import Crackers.utils.Friedman;
import textTools.textParser;

public class Main {
    public static void main(String[] args) {
        // if (args.length < 1) {
        //     System.out.println("Usage: java Main <file>");
        //     return;
        // }
        
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
        // coincidenceAnalizer.analize(textParser.getText("text.txt"));

        // FrequencyAlphabeth fas = new FrequencyAlphabeth();
        // fas.frequecyList(text);

        // // Viguenere Beaker Example
        // String text = textParser.getText(args[0]);
        // ViguenereBeaker viguenereBeaker = new ViguenereBeaker();
        // viguenereBeaker.breakKey(text);

        // Afin example
        String text = Afin.encrypt(5, 7, textParser.getText("TextExamples/RuidoVisual.txt"), true);
        System.out.println(text);
        System.out.println("-----------------------------------------------");
        System.out.println(Afin.decrypt(11, 7, text, false, true));

        // // Afin Brute example
        // AfinBrute.force(textParser.getText("TextExamples/afin.txt"), 27);

    }
}