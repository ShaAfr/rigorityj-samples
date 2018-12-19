package org.sharmin.samples;

import javax.crypto.spec.SecretKeySpec;

public class PredictableCryptographicKeyBBCase1 {
    public static void main(String [] args){
        String defaultKey = "defaultkey";
        byte[] keyBytes = defaultKey.getBytes();
        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
    }
}
