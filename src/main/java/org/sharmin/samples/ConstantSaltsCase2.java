package org.sharmin.samples;

import javax.crypto.spec.PBEParameterSpec;

public class ConstantSaltsCase2 {

    public static void main(String [] args){
        ConstantSaltsCase2 c = new ConstantSaltsCase2();
        byte[] salt = {(byte) 0xa2};
        int count = 1020;
        c.key2(salt,count);

    }
    public void key2(byte[] salt, int count){
        PBEParameterSpec pbeParamSpec = null;
        pbeParamSpec = new PBEParameterSpec(salt, count);
    }
}
