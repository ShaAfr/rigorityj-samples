package org.sharmin.samples;

import java.net.URL;

public class HttpProtocolCase1 {


    public static void main(String[] args) throws Exception {
        //String url = "http://localhost:8080/subscriptionlistener_uddi_client";
        String url = "http://www.google.com";
        System.out.println(new URL(url));
    }
}
