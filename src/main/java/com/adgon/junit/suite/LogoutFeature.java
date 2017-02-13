package com.adgon.junit.suite;

import lombok.Value;

@Value
public class LogoutFeature implements Feature {

    String userName;

    public String apply() {
        return userName;
    }
}
