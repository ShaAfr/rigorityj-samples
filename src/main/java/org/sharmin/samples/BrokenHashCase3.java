package org.sharmin.samples;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHashCase3 {
    public static void main (String [] args) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD4");
    }
}
