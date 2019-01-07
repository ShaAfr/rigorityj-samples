package org.sharmin.samples.predictablecryptographickey;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class PredictableCryptographicKeyABICase1 {
    public static void main(String [] args){
        String key = "defaultkey";
        go(key);
    }

    private static void go(String key) {
        byte[] keyBytes = key.getBytes();
        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
    }
}
