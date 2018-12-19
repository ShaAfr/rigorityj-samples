package org.sharmin.samples;

import java.security.SecureRandom;

public class PredictableSeedsABICase1 {
    public static void main (String [] args){
        long seed = 456789L;
        go(seed);
    }
    private static void go(long seed) {
        SecureRandom sr = new SecureRandom();
        sr.setSeed(seed);
        int v = sr.nextInt();
        System.out.println(v);
    }
}
