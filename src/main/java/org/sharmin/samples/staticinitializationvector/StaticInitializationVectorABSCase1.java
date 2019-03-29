package org.sharmin.samples.staticinitializationvector;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class StaticInitializationVectorABSCase1 {
    CryptoStaticIV1 crypto;
    public StaticInitializationVectorABSCase1() throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException {
        byte [] bytes = "abcde".getBytes();
        IvParameterSpec ivSpec = new IvParameterSpec(bytes);
        crypto = new CryptoStaticIV1(ivSpec);
        crypto.method1(null);
    }
}

class CryptoStaticIV1 {
    IvParameterSpec defIVSpec;

    public CryptoStaticIV1(IvParameterSpec ivSpec) {
        defIVSpec = ivSpec;
    }

    public void method1(IvParameterSpec passedIVSpec) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException {

        passedIVSpec = defIVSpec;

        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        SecretKey key = keyGen.generateKey();
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE,key,passedIVSpec);

    }
}

