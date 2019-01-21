//package org.sharmin.samples.insecureasymmetriccrypto;
//
//import javax.crypto.*;
//import java.io.IOException;
//import java.security.InvalidKeyException;
//import java.security.KeyPair;
//import java.security.KeyPairGenerator;
//import java.security.NoSuchAlgorithmException;
//import java.util.HashMap;
//import java.util.Map;
//
//public class InsecureAsymmetricCipherABHCase1 {
//    public void go() throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IOException, IllegalBlockSizeException, BadPaddingException, ClassNotFoundException {
//
//        Map<String,String> hm = new HashMap<String, String>();
//        hm.put("aaa", "AES");
//        hm.put("bbb", "RSA");
//
//        String algo = hm.get("bbb");
//
//        KeyPairGenerator kgp = KeyPairGenerator.getInstance(algo);
//        int keysize = 1024;
//        kgp.initialize(keysize);
//        KeyPair kp = kgp.generateKeyPair();
//
//
//        Cipher cipher = Cipher.getInstance(algo);
//        cipher.init(Cipher.ENCRYPT_MODE, kp.getPublic());
//
//        //encrypting
//        String myMessage = new String("Secret Message");
//        SealedObject encryptedMessage = new SealedObject(myMessage,cipher);
//
//        //decrypting
//        Cipher dec = Cipher.getInstance(algo);
//        dec.init(Cipher.DECRYPT_MODE, kp.getPrivate());
//
//        String message = (String) encryptedMessage.getObject(dec);
//        System.out.println(message);
//    }
//
//    public static void main (String [] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, IllegalBlockSizeException, BadPaddingException, ClassNotFoundException {
//        InsecureAsymmetricCipherABHCase1 bc = new InsecureAsymmetricCipherABHCase1();
//        bc.go();
//    }
//}
