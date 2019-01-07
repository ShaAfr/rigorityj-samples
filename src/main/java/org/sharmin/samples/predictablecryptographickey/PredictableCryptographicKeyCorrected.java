package org.sharmin.samples.predictablecryptographickey;

import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;

public class PredictableCryptographicKeyCorrected {
    public static void main(String [] args){
        SecureRandom random = new SecureRandom();
        String defaultKey = String.valueOf(random.ints());

        //String defaultKey = "defaultkey";
        byte[] keyBytes = defaultKey.getBytes();
        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
    }
}
