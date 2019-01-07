//package org.sharmin.samples;
//
//import javax.crypto.Cipher;
//import java.security.*;
//
//public class InsecureAsymmetricCipher {
//
//
//    public static void main(String [] args) throws Exception {
//        KeyPair keyPair = buildKeyPair();
//        PublicKey pubKey = keyPair.getPublic();
//        PrivateKey privateKey = keyPair.getPrivate();
//
//        // sign the message
//        byte [] signed = encrypt(privateKey, "This is a secret message");
//        System.out.println(new String(signed));  // <<signed message>>
//
//        // verify the message
//        byte[] verified = decrypt(pubKey, signed);
//        System.out.println(new String(verified));     // This is a secret message
//    }
//    public static KeyPair buildKeyPair() throws NoSuchAlgorithmException {
//        final int keySize = 2048;
//        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
//        keyPairGenerator.initialize(keySize);
//        return keyPairGenerator.genKeyPair();
//    }
//    public static byte[] encrypt(PrivateKey privateKey, String message) throws Exception {
//        Cipher cipher = Cipher.getInstance("RSA");
//        cipher.init(Cipher.ENCRYPT_MODE, privateKey);
//
//        return cipher.doFinal(message.getBytes());
//    }
//    public static byte[] decrypt(PublicKey publicKey, byte [] encrypted) throws Exception {
//        Cipher cipher = Cipher.getInstance("RSA");
//        cipher.init(Cipher.DECRYPT_MODE, publicKey);
//
//        return cipher.doFinal(encrypted);
//    }
//}
