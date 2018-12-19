package org.sharmin.samples;

import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class PredictablePBEPasswordCorrected {
    private PBEKeySpec pbeKeySpec = null;
    private PBEParameterSpec pbeParamSpec = null;

    public static void main(String [] args){
        PredictablePBEPasswordCorrected ckp = new PredictablePBEPasswordCorrected();
        ckp.key();
    }
    public void key() {
        SecureRandom random = new SecureRandom();
        String password = String.valueOf(random.ints());
        pbeKeySpec = new PBEKeySpec(password.toCharArray());
    }
}
