package org.sharmin.samples.ecbcrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class EcbInSymmCryptoABHCase1 {
    public void go() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        SecretKey key = keyGen.generateKey();

        Map<String,String> hm = new HashMap<String, String>();
        hm.put("aaa", "AES/CBC/PKCS5Padding");
        hm.put("bbb", "AES/ECB/PKCS5Padding");

        String algo = hm.get("bbb");
        Cipher cipher = Cipher.getInstance(algo);
        cipher.init(Cipher.ENCRYPT_MODE, key);
    }

    public static void main (String [] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        EcbInSymmCryptoABHCase1 bc = new EcbInSymmCryptoABHCase1();
        bc.go();
    }
}
