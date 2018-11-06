package org.sharmin.samples;

import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class ConstantSaltsCorrected {
    public static void main(){
        LessThan1000IterationPBECorrected lt = new LessThan1000IterationPBECorrected();
        lt.key2();
    }
    public void key2(){
        SecureRandom random = new SecureRandom();
        PBEParameterSpec pbeParamSpec = null;
        byte[] salt = new byte[32];
        random.nextBytes(salt);
        int count = 1020;
        pbeParamSpec = new PBEParameterSpec(salt, count);
    }
}
