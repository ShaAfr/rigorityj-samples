package org.sharmin.samples;

import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

public class PredictablePBEPasswordBBCase1 {
    private PBEKeySpec pbeKeySpec = null;
    private PBEParameterSpec pbeParamSpec = null;

    public static void main(String [] args){
        PredictablePBEPasswordBBCase1 ckp = new PredictablePBEPasswordBBCase1();
        ckp.key();
    }
    public void key() {
        pbeKeySpec = new PBEKeySpec("saagar".toCharArray());
    }

}
