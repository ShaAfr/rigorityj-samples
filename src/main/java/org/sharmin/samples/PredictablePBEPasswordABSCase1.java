package org.sharmin.samples;

import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import java.net.MalformedURLException;
import java.net.URL;

public class PredictablePBEPasswordABSCase1 {
    CryptoPredictablePBE crypto;
    public PredictablePBEPasswordABSCase1(){
        String password = "sagar";
        crypto = new CryptoPredictablePBE(password);
        crypto.encrypt("");
    }
}


class CryptoPredictablePBE {
    String defPassword;
    private PBEKeySpec pbeKeySpec = null;
    private PBEParameterSpec pbeParamSpec = null;

    public CryptoPredictablePBE(String password){

        defPassword = password;
    }

    public void encrypt(String passedPassword) {

        if(passedPassword.isEmpty()){
            passedPassword = defPassword;
        }
        pbeKeySpec = new PBEKeySpec(passedPassword.toCharArray());
    }
}