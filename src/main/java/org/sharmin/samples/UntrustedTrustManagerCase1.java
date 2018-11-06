package org.sharmin.samples;

import javax.net.ssl.X509TrustManager;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public class UntrustedTrustManagerCase1 implements X509TrustManager {

    @Override
    public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
        //Trust any client connecting (no certificate validation)
    }

    @Override
    public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
        //Trust any remote server (no certificate validation)
    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return null;
    }
}
