package Crackers.utils;

public class Friedman {
    public static int spanishTest(String text){
        double IC = CoincidenceAnalizer.analize(text, false);
        if(IC >= 0.0744)
            return 1;
        if(IC < 0.0744 && IC >= 0.0546)
            return 2;
        if(IC < 0.0546 && IC >= 0.0495)
            return 3;
        if(IC < 0.0495 && IC >= 0.0473)
            return 4;
        if(IC < 0.0473 && IC >= 0.0449)
            return 6;
        if(IC < 0.0449 && IC >= 0.0439)
            return 5;
        if(IC < 0.0439 && IC >= 0.0423)
            return 7;
        if(IC < 0.0423 && IC >= 0.0419)
            return 8;
        if(IC < 0.0419 && IC >= 0.0415)
            return 9;
        if(IC >= 0.0414)
            return 10;
        if(IC < 0.0414 && IC >= 0.0395)
            return 15;
        if(IC < 0.0395 && IC >= 0.0388)
            return 20;
        else return 9999;
    }

    public static int spanishTest(Double IC){
        if(IC >= 0.0744)
            return 1;
        if(IC < 0.0744 && IC >= 0.0546)
            return 2;
        if(IC < 0.0546 && IC >= 0.0495)
            return 3;
        if(IC < 0.0495 && IC >= 0.0473)
            return 4;
        if(IC < 0.0473 && IC >= 0.0449)
            return 6;
        if(IC < 0.0449 && IC >= 0.0439)
            return 5;
        if(IC < 0.0439 && IC >= 0.0423)
            return 7;
        if(IC < 0.0423 && IC >= 0.0419)
            return 8;
        if(IC < 0.0419 && IC >= 0.0415)
            return 9;
        if(IC >= 0.0414)
            return 10;
        if(IC < 0.0414 && IC >= 0.0395)
            return 15;
        if(IC < 0.0395 && IC >= 0.0388)
            return 20;
        else return 9999;
    } 
}
