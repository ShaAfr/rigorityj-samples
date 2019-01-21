package org.sharmin.samples.predictablepbepassword;

import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class PredictablePBEPasswordBBCase1 {
    private PBEKeySpec pbeKeySpec = null;
    private PBEParameterSpec pbeParamSpec = null;

    public static void main(String [] args){
        PredictablePBEPasswordBBCase1 ckp = new PredictablePBEPasswordBBCase1();
        ckp.key();
    }
    public void key() {
        String defaultKey = "saagar";
        pbeKeySpec = new PBEKeySpec(defaultKey.toCharArray());
    }

}
