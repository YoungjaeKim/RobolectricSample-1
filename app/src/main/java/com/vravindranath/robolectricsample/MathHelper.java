package com.vravindranath.robolectricsample;

/**
 * Created by vivek on 23/9/14.
 */

public class MathHelper {
    public static int sumOf(int a, int b) {
        return a + b;
    }

    public static int differenceOf(int a, int b) {
        if(a > b) {
            return a - b;
        } else {
            return b - a;
        }
    }
}
