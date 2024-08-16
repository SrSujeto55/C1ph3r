package Crackers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyAnalyzer {

    private List<Map.Entry<Character, Integer>> frequecyList(String text){
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i<text.length(); i++){
            char c = text.charAt(i);
            if(Character.isLetter(c)){
                if(frequencyMap.containsKey(c)) frequencyMap.put(c, frequencyMap.get(c) + 1);
                else frequencyMap.put(c, 1);
            }
        }

        List<Map.Entry<Character, Integer>> orderedFrequencyList = new ArrayList<>(frequencyMap.entrySet());
        orderedFrequencyList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue())); 

        //Debug purposes
        for (Map.Entry<Character,Integer> entry : orderedFrequencyList) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        return orderedFrequencyList;
    }

    private HashMap<Character, Character> realteMaps(List<Map.Entry<Character, Integer>> frequencyMap, char[] frequencyAlphabeth){
        HashMap<Character, Character> relationMap = new HashMap<>();
        for (int i = 0; i<frequencyMap.size(); i++){
            relationMap.put(frequencyMap.get(i).getKey(), frequencyAlphabeth[i]);
        }
        return relationMap;
    }

    public String replaceText(String text, char[] frequencyAlphabeth){
        text = text.toLowerCase().strip();
        List<Map.Entry<Character, Integer>> frequencyMap = frequecyList(text);
        HashMap<Character, Character> relationMap = realteMaps(frequencyMap, frequencyAlphabeth);
        char[] textArray = text.toCharArray();

        for (int i = 0; i<textArray.length; i++){
            if(Character.isLetter(textArray[i])){
                textArray[i] = relationMap.get(textArray[i]);
            }
        }

        return new String(textArray);
    }
}