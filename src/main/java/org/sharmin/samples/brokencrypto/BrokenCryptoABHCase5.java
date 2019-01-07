package org.sharmin.samples.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class BrokenCryptoABHCase5 {
    public void go() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Map<String,String> hm = new HashMap<String, String>();
        hm.put("aaa", "DES/ECB/PKCS5Padding");
        hm.put("bbb", "Blowfish");
        hm.put("ccc", "RC4");
        hm.put("ddd", "RC2");
        hm.put("eee", "IDEA");

        String algo = hm.get("eee");

        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        SecretKey key = keyGen.generateKey();
        Cipher cipher = Cipher.getInstance(algo);
        cipher.init(Cipher.ENCRYPT_MODE, key);
    }

    public static void main (String [] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        BrokenCryptoABHCase5 bc = new BrokenCryptoABHCase5();
        bc.go();
    }
}
