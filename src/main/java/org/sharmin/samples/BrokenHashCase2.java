package org.sharmin.samples;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHashCase2 {
    public static void main (String [] args) throws NoSuchAlgorithmException {
        String name = "Sharmin";
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(name.getBytes());
        System.out.println(md.digest());
    }
}
