package com.linearandbinarysearch;

public class SBCompare {

    public static void main(String[] args) {

        int iterations = 1_000_000;
        String text = "hello";

        // StringBuffer performance test
        StringBuffer sbuf = new StringBuffer();
        long startBuf = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            sbuf.append(text);
        }

        long endBuf = System.nanoTime();
        long bufferTime = endBuf - startBuf;

        // StringBuilder performance test
        StringBuilder sbld = new StringBuilder();
        long startBld = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            sbld.append(text);
        }

        long endBld = System.nanoTime();
        long builderTime = endBld - startBld;

        // Output result
        System.out.println("StringBuffer Time : " + bufferTime + " ns");
        System.out.println("StringBuilder Time: " + builderTime + " ns");
    }
}
