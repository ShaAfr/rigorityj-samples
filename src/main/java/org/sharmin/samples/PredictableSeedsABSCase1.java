package org.sharmin.samples;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class PredictableSeedsABSCase1 {
    CryptoPredictableSeed1 crypto;
    public PredictableSeedsABSCase1() throws NoSuchAlgorithmException, NoSuchPaddingException {
        long seed = 456789L;
        crypto = new CryptoPredictableSeed1(seed);
    }
}

class CryptoPredictableSeed1 {
    long defSeed;

    public CryptoPredictableSeed1(long seed) throws NoSuchPaddingException, NoSuchAlgorithmException {
        defSeed = seed;
    }

    public void encrypt(long passedSeed) throws UnsupportedEncodingException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, NoSuchPaddingException {

        passedSeed = defSeed;

        SecureRandom sr = new SecureRandom();
        sr.setSeed(passedSeed);
        int v = sr.nextInt();
        System.out.println(v);
    }
}