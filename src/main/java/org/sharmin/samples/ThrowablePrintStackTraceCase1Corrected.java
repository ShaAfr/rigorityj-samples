package org.sharmin.samples;




public class ThrowablePrintStackTraceCase1Corrected {
    public static void main(String [] args) {
        int [] a = {1,2,3};
        try{
            System.out.println(a[5]);
        }catch(Exception e){

        }
    }
}