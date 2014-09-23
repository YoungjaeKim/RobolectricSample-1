package com.vravindranath.robolectricsample;

import android.widget.Button;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by vivek on 23/9/14.
 */
@Config(emulateSdk = 18, manifest = "app/src/main/AndroidManifest.xml")
@RunWith(RobolectricTestRunner.class)
public class HomeActivityTest {

    private HomeActivity mHomeActivity;

    @Before
    public void setup() {
        mHomeActivity = Robolectric.buildActivity(HomeActivity.class)
                .create()
                .resume()
                .visible()
                .get();
    }

    @Test
    public void testHomeActivityCreation() {
        assertThat(mHomeActivity).isNotNull();
    }

    @Test
    public void testClickMe() {
        TextView tv = (TextView) mHomeActivity.findViewById(R.id.status);
        Button btn = (Button) mHomeActivity.findViewById(R.id.click);
        btn.performClick();

        assertThat(tv).isNotNull();
        String result = tv.getText().toString();
        String expected = mHomeActivity.getResources().getString(R.string.clicked);
        assertThat(result).isEqualTo(expected);
    }
}
