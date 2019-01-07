package org.sharmin.samples.http;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class HttpProtocolABHCase2 {
    public static void main(String[] args) throws Exception {
        Map<String,String> hm = new HashMap<String, String>();
        hm.put("aaa", "http://www.google.com");
        hm.put("bbb", "https://www.google.com");
        hm.put("ccc", "http://www.facebook.com");
        hm.put("ddd", "https://www.facebook.com");

        String url = hm.get("aaa");

        //String url = "http://www.facebook.com";
        System.out.println(new URL(url));
    }
}
