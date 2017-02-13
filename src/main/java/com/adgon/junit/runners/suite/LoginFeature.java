package com.adgon.junit.runners.suite;

import lombok.Value;

@Value
public class LoginFeature implements Feature {

    String userName;

    public String apply() {
        return userName;
    }

}
