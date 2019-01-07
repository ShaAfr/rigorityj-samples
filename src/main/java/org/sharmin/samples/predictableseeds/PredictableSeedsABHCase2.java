package org.sharmin.samples.predictableseeds;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

public class PredictableSeedsABHCase2 {
    public static void main (String [] args){
        Map<String,Long> hm = new HashMap<String, Long>();
        hm.put("aaa", new Long(100));
        hm.put("bbb", new Long(200));
        hm.put("ccc", new Long(300));
        hm.put("ddd", new Long(400));

        long l = hm.get("aaa");

        SecureRandom sr = new SecureRandom();

        sr.setSeed(l);
        int v = sr.nextInt();
        System.out.println(v);
    }
}
