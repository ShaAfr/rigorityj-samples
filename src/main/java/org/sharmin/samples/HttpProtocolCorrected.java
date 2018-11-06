package org.sharmin.samples;

import java.net.URL;

public class HttpProtocolCorrected {
    public static final String url = "https://localhost:8080/subscriptionlistener_uddi_client";

    public static void main(String[] args) throws Exception {
        // write your code here
        System.out.println(new URL(url));
    }
}
