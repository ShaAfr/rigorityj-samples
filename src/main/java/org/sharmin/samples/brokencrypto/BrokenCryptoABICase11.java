package org.sharmin.samples.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCryptoABICase11 {
    public static void method2(String c, KeyGenerator keyGen) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        String cryptoAlgo = c;
        method1(cryptoAlgo,keyGen);
    }
    public static void method1(String crypto,KeyGenerator keyGen) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {

        SecretKey key = keyGen.generateKey();
        Cipher cipher = Cipher.getInstance(crypto);
        cipher.init(Cipher.ENCRYPT_MODE, key);
    }

    public static void main (String [] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        KeyGenerator keyGen = KeyGenerator.getInstance("DES");
        String crypto = "DES/ECB/PKCS5Padding";
        method2(crypto,keyGen);
    }
}
