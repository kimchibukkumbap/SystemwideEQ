package com.example.myandroidproject;

public class AudioUtils {
    /**
     * A simple placeholder for a parametric EQ gain check.
     * In a real app, this might calculate filter coefficients.
     */
    public static boolean isFrequencyInRange(int frequency) {
        return frequency >= 20 && frequency <= 20000;
    }
}