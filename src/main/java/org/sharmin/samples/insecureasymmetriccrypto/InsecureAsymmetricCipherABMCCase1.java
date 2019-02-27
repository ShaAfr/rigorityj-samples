package org.sharmin.samples.insecureasymmetriccrypto;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class InsecureAsymmetricCipherABMCCase1 {
    public static void main (String [] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, IllegalBlockSizeException, BadPaddingException, ClassNotFoundException {
        InsecureAsymmetricCipherABMC1 bc = new InsecureAsymmetricCipherABMC1();
        KeyPairGenerator kgp = KeyPairGenerator.getInstance("RSA");
        //kgp.initialize(1024);
        KeyPair kp = kgp.generateKeyPair();
        Cipher cipher = Cipher.getInstance("RSA");
        Cipher dec = Cipher.getInstance("RSA");
        bc.go(kgp,kp,cipher,dec);
    }
}
