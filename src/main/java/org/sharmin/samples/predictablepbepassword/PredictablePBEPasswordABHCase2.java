package org.sharmin.samples.predictablepbepassword;

import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import java.util.HashMap;
import java.util.Map;

public class PredictablePBEPasswordABHCase2 {
    private PBEKeySpec pbeKeySpec = null;
    private PBEParameterSpec pbeParamSpec = null;

    public static void main(String [] args){
        PredictablePBEPasswordABHCase2 ckp = new PredictablePBEPasswordABHCase2();
        Map<String,String> hm = new HashMap<String, String>();
        hm.put("aaa", "afix");
        hm.put("bbb", "bfix");
        hm.put("ccc", "cfix");
        hm.put("ddd", "dfix");

        String key = hm.get("aaa");
        ckp.key(key);
    }
    public void key(String key) {
        pbeKeySpec = new PBEKeySpec(key.toCharArray());
    }
}
