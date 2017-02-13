package com.adgon.junit.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        LoginFeatureTest.class,
        LogoutFeatureTest.class
})
public class FeatureTestSuite {
    // class remains empty
    // used only as holder for the abouve annotations
}
