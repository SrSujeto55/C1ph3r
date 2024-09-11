package Crackers.utils;

public class gcd {
    public static int Euclides(int a, int b){
        if(b == 0){
            return a;
        }
        return Euclides(b, a % b);
    }
}
