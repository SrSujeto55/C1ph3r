package Crackers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import Crackers.utils.FrequencyAlphabeth;

public class FrequencyAnalyzer {

    private static HashMap<Character, Character> relateMaps(List<Map.Entry<Character, Integer>> frequencyMap, char[] frequencyAlphabeth){
        HashMap<Character, Character> relationMap = new HashMap<>();
        for (int i = 0; i<frequencyMap.size(); i++){
            relationMap.put(frequencyMap.get(i).getKey(), frequencyAlphabeth[i]);
        }
        return relationMap;
    }

    public static String replaceText(String text, char[] frequencyAlphabeth){
        text = text.toLowerCase().strip();
        List<Map.Entry<Character, Integer>> frequencyMap = FrequencyAlphabeth.frequecyList(text, false);
        HashMap<Character, Character> relationMap = relateMaps(frequencyMap, frequencyAlphabeth);
        char[] textArray = text.toCharArray();

        for (int i = 0; i<textArray.length; i++){
            if(Character.isLetter(textArray[i])){
                textArray[i] = relationMap.get(textArray[i]);
            }
        }

        return new String(textArray);
    }
}