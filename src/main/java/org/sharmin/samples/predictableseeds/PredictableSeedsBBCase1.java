package org.sharmin.samples.predictableseeds;

import java.security.SecureRandom;

public class PredictableSeedsBBCase1 {

    public static void main (String [] args){
        SecureRandom sr = new SecureRandom();
        sr.setSeed(456789L); // Noncompliant
        int v = sr.nextInt();
        System.out.println(v);
    }
}