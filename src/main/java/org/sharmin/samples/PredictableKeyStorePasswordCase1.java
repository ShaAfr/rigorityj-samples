package org.sharmin.samples;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

public class PredictableKeyStorePasswordCase1 {

    URL cacerts;

    {
        try {
            String type = "JKS";
            KeyStore ks = KeyStore.getInstance(type);
            cacerts = new URL("http://www.google.com");
            ks.load(cacerts.openStream(), "changeit".toCharArray());
        } catch (IOException | NoSuchAlgorithmException | CertificateException | KeyStoreException e) {
            e.printStackTrace();
        }
    }

}
