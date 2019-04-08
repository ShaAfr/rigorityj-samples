package org.sharmin.samples.staticinitializationvector;

import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class StaticInitializationVectorABMCCase1 {
    public static void main (String [] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        StaticInitializationVectorABMC1 siv = new StaticInitializationVectorABMC1();
        byte [] bytes = "abcde".getBytes();

        siv.go(bytes);
    }
}
