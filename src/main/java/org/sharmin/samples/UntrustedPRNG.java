package org.sharmin.samples;

import java.util.Random;

public class UntrustedPRNG {
    private static Random randomGenerator = new Random();
    public static void main(String [] args)
    {
        int x = randomGenerator.nextInt();
        System.out.println(x);
    }



}
