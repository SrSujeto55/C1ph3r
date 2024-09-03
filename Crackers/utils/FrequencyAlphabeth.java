package Crackers.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyAlphabeth {

    /*
     * This method receives a text and returns a list of the frequency of each character in the text in order
     * @param text The text to be analyzed
     * @return List<Map.Entry<Character, Integer>> A list of the frequency of each character in the text in order
     */
    public static List<Map.Entry<Character, Integer>> frequecyList(String text, boolean verbose){
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        char[] textArray = text.toCharArray();

        // Count the frequency of each character in the text with a map
        for (int i = 0; i<text.length(); i++){
            char c = textArray[i];
            if(Character.isLetter(c)){
                if(frequencyMap.containsKey(c)) frequencyMap.put(c, frequencyMap.get(c) + 1);
                else frequencyMap.put(c, 1);
            }
        }
        
        // Sort the map in order of frequency
        List<Map.Entry<Character, Integer>> orderedFrequencyList = new ArrayList<>(frequencyMap.entrySet());
        orderedFrequencyList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue())); 

        //Prints the ordered frequency list
        if(verbose){
            for (Map.Entry<Character,Integer> entry : orderedFrequencyList) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }

        return orderedFrequencyList;
    }

    /*
     * This method receives a text and returns the pair <key, value> of the most common letter in the text, 
     * @param text The text to be analyzed
     * @return Map.Entry<Character, Integer> the pair key value of the most common letter in the text
     */
    public static Map.Entry<Character, Integer> frequencyFirst(String text, boolean verbose){
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        char[] textArray = text.toCharArray();

        // Count the frequency of each character in the text with a map
        for (int i = 0; i<text.length(); i++){
            char c = textArray[i];
            if(Character.isLetter(c)){
                if(frequencyMap.containsKey(c)) frequencyMap.put(c, frequencyMap.get(c) + 1);
                else frequencyMap.put(c, 1);
            }
        }
        
        // Sort the map in order of frequency
        List<Map.Entry<Character, Integer>> orderedFrequencyList = new ArrayList<>(frequencyMap.entrySet());
        orderedFrequencyList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue())); 

        //Prints the first element of the ordered frequency list
        if (verbose) {
            System.out.println(orderedFrequencyList.get(0).getKey() + " : " + orderedFrequencyList.get(0).getValue());
        }

        return orderedFrequencyList.get(0);
    }

    /*
     * This method receives a text and prints the 3 most common letters in the text in order
     * @param text The text to be analyzed
     * @return List<Map.Entry<Character, Integer>> A list of the frequency of each character in the text in order
     */
    public static void frequencyThree(String text, boolean verbose){
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        char[] textArray = text.toCharArray();

        // Count the frequency of each character in the text with a map
        for (int i = 0; i<text.length(); i++){
            char c = textArray[i];
            if(Character.isLetter(c)){
                if(frequencyMap.containsKey(c)) frequencyMap.put(c, frequencyMap.get(c) + 1);
                else frequencyMap.put(c, 1);
            }
        }
        
        // Sort the map in order of frequency
        List<Map.Entry<Character, Integer>> orderedFrequencyList = new ArrayList<>(frequencyMap.entrySet());
        orderedFrequencyList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue())); 

        //Prints the firsts 3 elements of the ordered frequency list
        if (verbose) {
            for (int i = 0; i < 3; i++) {
                System.out.println(orderedFrequencyList.get(i).getKey() + " : " + orderedFrequencyList.get(i).getValue());
            }
        }
    }
}
