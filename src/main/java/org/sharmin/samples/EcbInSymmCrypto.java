package org.sharmin.samples;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;

public class EcbInSymmCrypto {
    public static void main(String [] args) throws NoSuchPaddingException, NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException {
        SecureRandom r = new SecureRandom();
        byte[] keyBytes = new byte[]{22};
        SecretKeySpec key = new SecretKeySpec(keyBytes, "DES");
        Cipher cipher = Cipher.getInstance("DES/ECB/PKCS7Padding", "BC");
        cipher.init(Cipher.ENCRYPT_MODE, key);
    }

}
