package com.example.myandroidproject;

import org.junit.Test;
import static org.junit.Assert.*;

public class AudioUtilsTest {

    @Test
    public void frequency_isWithinHumanHearing() {
        // We expect 1000Hz (1kHz) to be valid
        assertTrue(AudioUtils.isFrequencyInRange(1000));
    }

    @Test
    public void frequency_isOutsideHumanHearing() {
        // We expect 25000Hz to be invalid
        assertFalse(AudioUtils.isFrequencyInRange(25000));
    }
}