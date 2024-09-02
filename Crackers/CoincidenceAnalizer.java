package Crackers;

import java.util.HashMap;

public class CoincidenceAnalizer {

    public void analize(String text){
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
        System.out.println("-------------------------------------------"); //! Debug purposes

        coincidenceIndex /= ((double)text.length() * ((double)text.length() - 1));
        System.out.println("Text length: " + text.length()); //! Debug purposes
        System.out.println("CoicidenceIndex : " + coincidenceIndex); //! Debug purposes
    }
}