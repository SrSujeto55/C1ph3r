package Crackers;

import java.util.ArrayList;
import java.util.List;

import Ciphers.Afin;
import Crackers.utils.gcd;

public class AfinBrute {
    

    public static final String CYAN = "\033[36m";
    public static final String RESET = "\033[0m";
    public static void force(String text, int alphabetSize){
        boolean is27 = alphabetSize == 27;
        List<Integer> inverse = getInverseList(getPrimeRelative(alphabetSize), alphabetSize);
        System.out.println(CYAN + "Prime relatives: " + getPrimeRelative(alphabetSize) + RESET);
        System.out.println(CYAN + "Inverse list: " + inverse + RESET);
        int posibilityCounter = 0;
        for(int beta : inverse){
            for(int alpha = 0; alpha<alphabetSize; alpha++){
                posibilityCounter++;
                System.out.println("------------------------------------------------------------");
                System.out.println("-F(x) = (x - " + alpha + ") * " + beta + " % " + alphabetSize);
                System.out.println(Afin.decrypt(beta, alpha, text, false, is27));
                System.out.println("------------------------------------------------------------");
            }
        }

        System.out.println("Posibilities tried: " + posibilityCounter);
    }

    private static List<Integer> getPrimeRelative(int alphabetSize){
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i<alphabetSize; i++){
            if(gcd.Euclides(i, alphabetSize) == 1){
                result.add(i);
            }
        }
        return result;
    }

    private static List<Integer> getInverseList(List<Integer> primesRelatives, int alphabetSize){
        List<Integer> result = new ArrayList<>();
        for (Integer primeR : primesRelatives){
            for(int i = 0; i<alphabetSize; i++){
                if((i*primeR) % alphabetSize == 1){
                    result.add(i);
                }
            }
        }
        return result;
    }

}
