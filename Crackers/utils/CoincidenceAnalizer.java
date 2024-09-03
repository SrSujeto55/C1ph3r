package Crackers.utils;

import java.util.HashMap;

public class CoincidenceAnalizer {

    /*
     * This method analize the coincidence index of a given text
     * @param text The text to analize
     * @param freadman If true, the method will return the aproximate number of alphabets used
     * @return The coincidence index of the text
     */
    public static double analize(String text, boolean friedman){
        text = text.toLowerCase().strip()
                   .replaceAll("[^a-zñ]", "")
                   .replaceAll("[áàäâ]", "a")
                   .replaceAll("[éèëê]", "e")
                   .replaceAll("[íìïî]", "i")
                   .replaceAll("[óòöô]", "o")
                   .replaceAll("[úùüû]", "u")
                   .replaceAll(" ", "");
        char[] charText = text.toCharArray();

        HashMap <Character, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i<text.length(); i++){
            char c = charText[i];
            if(frequencyMap.containsKey(c)) frequencyMap.put(c, frequencyMap.get(c) + 1);
            else frequencyMap.put(c, 1);
        }
        
        System.out.println("---------------Frequency Map---------------"); //! Debug purposes
        double coincidenceIndex = 0;
        for (char c : frequencyMap.keySet()){
            double frequency = frequencyMap.get(c);
            System.out.println(c + " : " + frequency); //! Debug purposes
            coincidenceIndex += (frequency * (frequency - 1));
        }
        System.out.println("---------------Frequency Map---------------\n"); //! Debug purposes

        coincidenceIndex /= ((double)text.length() * ((double)text.length() - 1));
        System.out.println("---------------Text Data---------------"); //! Debug purposes
        System.out.println("Text length: " + text.length()); //! Debug purposes
        System.out.println("CoicidenceIndex : " + coincidenceIndex); //! Debug purposes

        if(friedman){
            System.out.println("Aproximate number of alphabets used : " + Friedman.spanishTest(coincidenceIndex));
        }
        System.out.println("---------------Text Data---------------\n"); //! Debug purposes

        return coincidenceIndex;
    }
}