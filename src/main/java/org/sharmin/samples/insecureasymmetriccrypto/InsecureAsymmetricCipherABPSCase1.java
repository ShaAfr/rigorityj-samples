package org.sharmin.samples.insecureasymmetriccrypto;
import javax.crypto.*;
import java.io.IOException;
import java.security.*;

public class InsecureAsymmetricCipherABPSCase1 {
    public void go(int choice) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IOException, IllegalBlockSizeException, BadPaddingException, ClassNotFoundException {
        KeyPairGenerator kgp = KeyPairGenerator.getInstance("RSA");
        int keysize = 1024;
        kgp.initialize(keysize);
        KeyPair kp = kgp.generateKeyPair();

        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        SecretKey key = keyGen.generateKey();


        Cipher cipher = Cipher.getInstance("RSA");

        if(choice>1)
            cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

        if (choice>1)
            cipher.init(Cipher.ENCRYPT_MODE, key);
        else
            cipher.init(Cipher.ENCRYPT_MODE, kp.getPublic());

        //encrypting
        String myMessage = new String("Secret Message");
        SealedObject encryptedMessage = new SealedObject(myMessage,cipher);

        System.out.println(encryptedMessage);
    }

    public static void main (String [] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, IllegalBlockSizeException, BadPaddingException, ClassNotFoundException {
        InsecureAsymmetricCipherABPSCase1 bc = new InsecureAsymmetricCipherABPSCase1();
        int choice = 2;
        bc.go(choice);
    }
}
