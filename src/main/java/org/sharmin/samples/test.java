package org.sharmin.samples;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String [] args) throws UnsupportedEncodingException {
        Map<String,Integer> hm = new HashMap<String, Integer>();
        hm.put("a", new Integer(100));
        hm.put("b", new Integer(200));
        hm.put("c", new Integer(300));
        hm.put("d", new Integer(400));

        String str = "abc";
        Integer value = hm.get("a");
//        byte[] bytes = str.getBytes("UTF-8");
        System.out.println(value);


//        String a = "abc";
//        byte [] b = a.getBytes("UTF-8");
//        String ss = new String(b);
//
//        System.out.println(ss);
    }
}
