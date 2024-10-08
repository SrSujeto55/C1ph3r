package Ciphers.utils;

public class Inverter {

    public static int modInverse(int a, int mod){
        a = a % mod;
        if (a < 0) a += mod;
        for (int x = 1; x < mod; x++){
            if ((a * x) % mod == 1){
                return x;
            }
        }
        return 1;
    }
}
