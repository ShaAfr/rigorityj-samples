package org.sharmin.samples;

import javax.crypto.spec.PBEParameterSpec;

public class ConstantSaltsCase1 {


    public void key2(){
        PBEParameterSpec pbeParamSpec = null;
        byte[] salt = {(byte) 0xc7};
        int count = 1020;
        pbeParamSpec = new PBEParameterSpec(salt, count);
    }
}
