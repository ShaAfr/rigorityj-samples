package org.sharmin.samples;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;

public class ImproperSocketManualHostCase1 {
    public static void main(String [] args) throws IOException {
        SSLSocketFactory ssf = (SSLSocketFactory) SSLSocketFactory.getDefault();
        SSLSocket socket = (SSLSocket) ssf.createSocket("my.host.name", 443);
    }
}
