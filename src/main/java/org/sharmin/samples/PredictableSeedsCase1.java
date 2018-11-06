package org.sharmin.samples;

import java.security.SecureRandom;

public class PredictableSeedsCase1 {

    public static void main (String [] args){
        SecureRandom sr = new SecureRandom();
        sr.setSeed(456789L); // Noncompliant
        int v = sr.nextInt();
        System.out.println(v);
    }
}
