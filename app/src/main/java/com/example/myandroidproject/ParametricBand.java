package com.example.myandroidproject;

public class ParametricBand {
    private float centerFrequency;
    private float gain;
    private float qFactor;

    public ParametricBand(float frequency, float gain, float q) {
        this.centerFrequency = frequency;
        this.gain = gain;
        this.qFactor = q;
    }

    // A "Parametric" EQ must have a Q factor.
    // This method ensures we don't set a Q of 0 (which would break the math).
    public void setQFactor(float q) {
        if (q > 0) {
            this.qFactor = q;
        }
    }

    public float getGain() {
        return gain;
    }

    public float getCenterFrequency() {
        return centerFrequency;
    }
}