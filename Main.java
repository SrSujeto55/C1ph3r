// import Classic.Cesar;
// import Crackers.FrequencyAnalyzer;

import Crackers.CoincidenceAnalizer;
import Crackers.FrequencyAnalyzer;
import Crackers.ViguenereBeaker;
import Crackers.utils.FrequencyAlphabeth;
import polialphabetic.Viguenere;

public class Main {
    public static void main(String[] args) {
        // // Cesar example
        // Cesar cesar = new Cesar(1);   
        // String text = "Hello World";
        // System.out.println(cesar.encrypt(text));
        // System.out.println(cesar.decrypt(cesar.encrypt(text)));
        // System.out.println(cesar.decrypt("Ifmmp Xpsme"));

        // // Winner Alphabeth (Frequency Analisis example)
        // FrequencyAnalyzer fa = new FrequencyAnalyzer();
        // char[] frequencyAlphabeth = {'a', 'e','s', 'o', 'i', 'n', 'r', 'l', 'c', 't', 'd', 'm', 'u', 'p', 'y', 'v','h', 'f', 'b', 'g', 'w', 'k', 'x', 'j', 'q', 'z'};
        // String text = "CKFIOPGJIK LMPGLKOCKO OGRIMLKLMO FKOPKNQMOP JGOLIKOMOC KFIOPGJIKL MCKOCQRFKO LMRCKOMOFG HAJMOCIAJM OWMORCKTGO SKPJIRIGOW SCMAMWGOOM NGJMOWOIMJ TGOHKMOPJG OWGXIRIKCM OMNQNKSKCK AJKGSJMOGJ MOWGSJIHIL GOOMMNXJMN PKJGNOIMHS JMHKNPQTIM JGNQNKCQRF KRGNOPKNPM TMCKLKQNKO TMRMOWGPJK OXJKNRKWKA IMJPKCQRFK BQMPMJHING OIMHSJMRGN CKPJKNOXGJ HKRIGNJMTG CQRIGNKJIK LMPGLKCKOG RIMLKLGMCF QNLIHIMNPG LMCKORCKOM OMNSQYNKMN CKOKNPMJIG JMOMSGRKOF IOPGJIRKOM NRGNPJKHGO RKOISGJPGL KOSKJPMOQN KRGHSCMPKL IXMJMNRIKR IGNLMCKOGR IMLKLMNLIT MJOGOMOPKH MNPGOQNKHQ CPISCMMORK CKYJKLQKCL MRGNLIRIGN MOOGRIKCMO MNCKKNPIYQ KJGHKFKCCK HGOSKPJIRI GOSCMAMWGO WMORCKTGOM NCKMLKLHML IKOMNGJMOX MQLKCMOTKO KCCGOHKMOP JGOGXIRIKC MOWOIMJTGO WKLMHKOMNR KOIPGLKOMO PKORCKOMOP GLKTIKMNRG NPJKHGOYJK LKRIGNMOMO SMRIKCMO";
        // System.out.println(fa.replaceText(text, frequencyAlphabeth));

        // // Coicidence Index
        // CoincidenceAnalizer coincidenceAnalizer = new CoincidenceAnalizer();
        // coincidenceAnalizer.analize(new textParser("text.txt").getText());

        // FrequencyAlphabeth fas = new FrequencyAlphabeth();
        // fas.frequecyList(text);

        // // Viguenere Beaker
        // ViguenereBeaker vb = new ViguenereBeaker();
        // vb.alphaberAnalizer(10, new textParser("text.txt").getText());
        System.out.println(Viguenere.decrypt(new textParser("text.txt").getText(), "SUNTZARTEG"));
        

    }
}