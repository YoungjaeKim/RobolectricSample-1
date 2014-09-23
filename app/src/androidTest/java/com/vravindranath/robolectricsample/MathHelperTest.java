package com.vravindranath.robolectricsample;

import com.vravindranath.robolectricsample.MathHelper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by vivek on 23/9/14.
 */

@Config(emulateSdk = 18)
@RunWith(RobolectricTestRunner.class)
public class MathHelperTest {

    @Test
    public void testSumOf() {
        assertThat(MathHelper.sumOf(2, 3)).isEqualTo(5);
    }

    @Test
    public void testDifferenceOf() {
        assertThat(MathHelper.differenceOf(6, 2)).isEqualTo(4);
    }

    @Test
    public void testDifferenceShouldBePositive() {
        assertThat(MathHelper.differenceOf(2, 6)).isPositive();
    }
}
