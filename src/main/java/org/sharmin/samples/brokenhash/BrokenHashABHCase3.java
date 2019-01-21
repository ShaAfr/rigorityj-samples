/*
package org.sharmin.samples.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class BrokenHashABHCase3 {
    public static void main (String [] args) throws NoSuchAlgorithmException {
        String name = "abcdef";
        Map<String,String> hm = new HashMap<String, String>();
        hm.put("aaa", "SHA1");
        hm.put("bbb", "MD5");
        hm.put("ccc", "MD4");
        hm.put("ddd", "MD2");

        String hash = hm.get("ccc");

        MessageDigest md = MessageDigest.getInstance(hash);
        md.update(name.getBytes());
        System.out.println(md.digest());
    }
}
*/
