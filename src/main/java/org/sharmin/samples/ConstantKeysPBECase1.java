package org.sharmin.samples;

import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

public class ConstantKeysPBECase1 {
    private PBEKeySpec pbeKeySpec = null;
    private PBEParameterSpec pbeParamSpec = null;

    public static void main(String [] args){


    }
    public void key() {
        pbeKeySpec = new PBEKeySpec("saagar".toCharArray());
    }

}
