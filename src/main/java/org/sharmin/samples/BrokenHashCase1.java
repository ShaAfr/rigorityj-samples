package org.sharmin.samples;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHashCase1 {
    public static void main (String [] args) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA1");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
