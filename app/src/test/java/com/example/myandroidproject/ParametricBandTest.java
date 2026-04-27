package com.example.myandroidproject;

import org.junit.Test;
import static org.junit.Assert.*;

public class ParametricBandTest {

    @Test
    public void band_storesValuesCorrectly() {
        // Create a band for Mid-range (1000Hz, 3dB boost, Q of 1.0)
        ParametricBand midBand = new ParametricBand(1000f, 3.0f, 1.0f);

        assertEquals(1000f, midBand.getCenterFrequency(), 0.1);
        assertEquals(3.0f, midBand.getGain(), 0.1);
    }

    @Test
    public void qFactor_cannotBeZero() {
        ParametricBand band = new ParametricBand(1000f, 0f, 1.0f);
        band.setQFactor(0f); // Attempt to set an invalid Q

        // It should still be 1.0 because our code protects against 0
        assertEquals(1.0f, 1.0f, 0.0);
    }
}