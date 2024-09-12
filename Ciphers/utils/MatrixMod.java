package Ciphers.utils;

import Crackers.utils.gcd;

public class MatrixMod {
    public static int[] multiplyMod2x2(int[] a, int[] b, int mod) {
        int[] result = new int[4];
        result[0] = (a[0] * b[0] + a[1] * b[2])%mod;
        result[1] = (a[0] * b[1] + a[1] * b[3])%mod;
        result[2] = (a[2] * b[0] + a[3] * b[2])%mod;
        result[3] = (a[2] * b[1] + a[3] * b[3])%mod;
        return result;
    }

    public static int[] multiplyDigramMod2x2(int[] matrix, int[] digram, int mod){
        int[] result = new int[2];
        result[0] = (matrix[0] * digram[0] + matrix[1] * digram[1])%mod;
        result[1] = (matrix[2] * digram[0] + matrix[3] * digram[1])%mod;
        return result;
    }

    public static int determinant2x2(int[] a, int mod){
        return (a[0] * a[3] - a[1] * a[2])%mod;
    }

    public static boolean isInvertible2x2(int[] a, int mod){
        return gcd.Euclides(determinant2x2(a, mod), mod) == 1;
    }

    public static int[] inverted2x2(int[] a, int mod){
        int det = determinant2x2(a, mod);
        int[] inverted = new int[4];
        inverted[0] = a[3];
        inverted[1] = -a[1];
        inverted[2] = -a[2];
        inverted[3] = a[0];
        for (int i = 0; i < 4; i++){
            inverted[i] = (inverted[i] * Inverter.modInverse(det, mod)) % mod;
            if (inverted[i] < 0){
                inverted[i] += mod;
            }
        }
        return inverted;
    }

    public static String print(int[] a, int size){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
            if ((i + 1) % size == 0){
                System.out.println();
            }
        }
        return "";
    }
}
