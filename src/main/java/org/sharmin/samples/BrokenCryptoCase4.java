package org.sharmin.samples;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCryptoCase4 {
    private Cipher cipher = Cipher.getInstance("RC2");
    SecretKey key;

    public BrokenCryptoCase4() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        cipher.init(Cipher.ENCRYPT_MODE, key);
    }

    public static void main (String [] args) {
    }
}
