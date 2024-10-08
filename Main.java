// import Classic.Cesar;
// import Crackers.FrequencyAnalyzer;

import java.util.InputMismatchException;
import java.util.Scanner;

import Ciphers.Viguenere;
import Ciphers.utils.MatrixMod;
import Ciphers.Afin;
import Ciphers.Hill;
import Ciphers.Playfair;
import Crackers.AfinBrute;
import Crackers.FrequencyAnalyzer;
import Crackers.HillBrute;
import Crackers.ViguenereBeaker;
import Crackers.utils.CharKeyGen;
import Crackers.utils.CoincidenceAnalizer;
import Crackers.utils.FrequencyAlphabeth;
import Crackers.utils.Friedman;
import textTools.textParser;

public class Main {
    public static void main(String[] args) {
        // if (args.length < 1) {
        // System.out.println("Usage: java Main <file>");
        // return;
        // }

        int mod = 27;

        // // Cesar example
        // Cesar cesar = new Cesar(1);
        // String text = "Hello World";
        // System.out.println(cesar.encrypt(text));
        // System.out.println(cesar.decrypt(cesar.encrypt(text)));
        // System.out.println(cesar.decrypt("Ifmmp Xpsme"));

        // Winner Alphabeth (Frequency Analisis example)
        // char[] spanishFrequencyAlphabeth = {'a', 'e','s', 'o', 'i', 'n', 'r', 'l',
        // 'c', 't', 'd', 'm', 'u', 'p', 'y', 'v','h', 'f', 'b', 'g', 'w', 'k', 'x',
        // 'j', 'q', 'z'};
        // String text = textParser.getText("TextExamples\\frequency.txt");
        // System.out.println(FrequencyAnalyzer.replaceText(text,
        // spanishFrequencyAlphabeth));

        // // Coicidence Index
        // CoincidenceAnalizer coincidenceAnalizer = new CoincidenceAnalizer();
        // coincidenceAnalizer.analize(textParser.getText("text.txt"));

        // FrequencyAlphabeth fas = new FrequencyAlphabeth();
        // fas.frequecyList(text);

        // // Viguenere Beaker Example
        // String text = textParser.getText(args[0]);
        // ViguenereBeaker viguenereBeaker = new ViguenereBeaker();
        // viguenereBeaker.breakKey(text);

        // // Afin example
        // String text = Afin.encrypt(5, 7,
        // textParser.getText("TextExamples/RuidoVisual.txt"), true);
        // System.out.println(text);
        // System.out.println("-----------------------------------------------");
        // System.out.println(Afin.decrypt(11, 7, text, false, true));

        // // Afin Brute example
        // AfinBrute.force(textParser.getText("TextExamples/afin.txt"), 27);

        // // Hill Examples
        // int[] A = {9,4,5,7};
        // System.out.println(MatrixMod.determinant2x2(A, mod));
        // System.out.println(MatrixMod.isInvertible2x2(A, mod));
        // MatrixMod.print(MatrixMod.inverted2x2(A, mod), 2);
        // MatrixMod.print(MatrixMod.multiplyMod2x2(A, MatrixMod.inverted2x2(A, mod),
        // mod), 2);

        // for (int i = 0; i < mod; i++) {
        //     for (int j = 0; j < mod; j++) {
        //         for (int k = 0; k < mod; k++) {
        //             for (int l = 0; l < mod; l++) {
        //                 int[] A = { i, j, k, l };
        //                 if (MatrixMod.isInvertible2x2(A, mod)) {
        //                     System.out.println("-------------------------Invertible-------------------------");
        //                     MatrixMod.print(A, 2);
        //                     System.out.println("Determinant: " + MatrixMod.determinant2x2(A, mod));
        //                     MatrixMod.print(MatrixMod.inverted2x2(A, mod), 2);
        //                     System.out.println("Multiplication:");
        //                     MatrixMod.print(MatrixMod.multiplyMod2x2(A, MatrixMod.inverted2x2(A, mod), mod), 2);
        //                     System.out.println("-------------------------Invertible-------------------------");
        //                 }
        //             }
        //         }
        //     }
        // }

        // System.out.println(Hill.encrypt(textParser.getText("TextExamples/RuidoVisual.txt"), new int[]{9,4,5,7}, false));
        // System.out.println("Inverted Key: ");
        // MatrixMod.print(MatrixMod.inverted2x2(new int[]{9,4,5,7}, mod), 2);

        // // Hill brute Force attempt 1
        // HillBrute.force(textParser.getText("TextExamples/Hill.txt"));

        // char[][] table = Playfair.generateAlphabethTable("chocolate");
        // MatrixMod.print(table);

        // // Playfair example
        // System.out.println(Playfair.encrypt(textParser.getText("TextExamples\\RuidoVisual.txt"), "chocolate"));
        // System.out.println(Playfair.decrypt(Playfair.encrypt(textParser.getText("TextExamples\\RuidoVisual.txt"), "chocolate"), "chocolate"));

        // // Playfair decrypt example
        // char[][] key = {{'N', 'I', 'C', 'O', 'L'}, {'A', 'S', 'M', 'Q', 'V'}, {'E', 'B', 'D', 'F', 'G'}, {'H', 'J', 'K', 'P', 'R'}, {'T', 'U', 'X', 'Y', 'Z'}};
        // System.out.println(Playfair.decrypt(textParser.getText("TextExamples\\Playfair.txt"), key));

    }
}