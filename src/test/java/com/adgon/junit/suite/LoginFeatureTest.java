package com.adgon.junit.suite;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoginFeatureTest {

    @Test
    public void shouldReturnUserNameOnApply() {
        String userName = "userName";
        Feature feature = new LoginFeature(userName);
        assertEquals(feature.apply(), userName);
    }

}