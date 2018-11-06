package org.sharmin.samples;

import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class CryptographicKeyShortCase2Corrected {
    public static void main(String args []) throws NoSuchAlgorithmException {
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
        keyPairGen.initialize(2048);
    }
}
