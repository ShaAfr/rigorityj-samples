package org.sharmin.samples.predictablepbepassword;

import org.sharmin.samples.predictablekeystorepassword.PredictableKeyStorePasswordABICase2;

import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class PredictablePBEPasswordABICase2 {
    private PBEKeySpec pbeKeySpec = null;
    private PBEParameterSpec pbeParamSpec = null;
    public static final String DEFAULT_ENCRYPT_KEY = "sagar";
    private static char[] ENCRYPT_KEY;
    private static char[] encryptKey;

    public static void main(String [] args) {
        PredictablePBEPasswordABICase2 pksp = new PredictablePBEPasswordABICase2();
        go2();
        go3();
        pksp.go();
    }

    private static void go2(){
        ENCRYPT_KEY = DEFAULT_ENCRYPT_KEY.toCharArray();
    }
    private static void go3(){
        encryptKey = ENCRYPT_KEY;
    }

    private void go() {
        pbeKeySpec = new PBEKeySpec(encryptKey);
    }
}
