package org.sharmin.samples;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public class DummyHostNameVerifierCase1 implements HostnameVerifier {


    @Override
    public boolean verify(String s, SSLSession sslSession) {
        return true;
    }
}
