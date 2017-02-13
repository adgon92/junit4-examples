package com.adgon.junit.runners.suite;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LogoutFeatureTest {

    @Test
    public void shouldReturnUsernameOnLogout() {
        String userName = "userName";
        Feature feature = new LogoutFeature(userName);
        assertEquals(feature.apply(), userName);
    }

}