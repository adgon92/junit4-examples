package com.adgon.junit.suite;

import lombok.Value;

@Value
public class LoginFeature implements Feature {

    String userName;

    public String apply() {
        return userName;
    }

}
