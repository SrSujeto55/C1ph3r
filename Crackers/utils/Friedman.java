package Crackers.utils;

import Crackers.CoincidenceAnalizer;

public class Friedman {
    public static int friedman(String text){
        CoincidenceAnalizer ca = new CoincidenceAnalizer();
        double IC = ca.analize(text);
        return 0;

    }
}
