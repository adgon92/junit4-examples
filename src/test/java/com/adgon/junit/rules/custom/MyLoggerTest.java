package com.adgon.junit.rules.custom;

import org.junit.Rule;
import org.junit.Test;

import java.util.logging.Logger;

public class MyLoggerTest {

    @Rule
    public final TestLogger logger = new TestLogger();

    @Test
    public void checkOutMyLogger() {
        final Logger log = logger.getLogger();
        log.warning("Your test is showing!");
    }

}
