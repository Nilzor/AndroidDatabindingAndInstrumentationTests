package com.example.databindinginstrutests;

import android.test.ActivityInstrumentationTestCase2;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
    public MainActivityTest(Class<MainActivity> activityClass) {
        super(activityClass);
    }

    public MainActivityTest(String pkg, Class<MainActivity> activityClass) {
        super(pkg, activityClass);
    }

    public MainActivityTest() {
        super(MainActivity.class);
    }

    public void testActivity() {
        getActivity();
        try {
            Thread.sleep(3000);
        }
        catch (Exception ex) {}
    }
}
