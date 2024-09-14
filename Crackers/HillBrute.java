package Crackers;

import Ciphers.Hill;
import Ciphers.utils.MatrixMod;

public class HillBrute {
    public static void force(String text) {
        int matrixCouner = 0;
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                for (int k = 0; k < 26; k++) {
                    for (int l = 0; l < 26; l++) {
                        int[] key = { i, j, k, l};
                        if (MatrixMod.isInvertible2x2(key, 26)) {
                            matrixCouner++;
                            Hill.decryptHint(text, key, false);
                        }
                    }
                }
            }
        }
        System.out.println("Matrices tested: " + matrixCouner);
    }
}
