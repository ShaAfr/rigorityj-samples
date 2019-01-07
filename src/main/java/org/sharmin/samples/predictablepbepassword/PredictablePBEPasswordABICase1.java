package org.sharmin.samples.predictablepbepassword;

import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

public class PredictablePBEPasswordABICase1 {
    private PBEKeySpec pbeKeySpec = null;
    private PBEParameterSpec pbeParamSpec = null;

    public static void main(String [] args){
        PredictablePBEPasswordABICase1 ckp = new PredictablePBEPasswordABICase1();
        String password = "sagar";
        ckp.key(password);
    }
    public void key(String password) {
        pbeKeySpec = new PBEKeySpec(password.toCharArray());
    }

}
