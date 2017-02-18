package com.adgon.junit.timeout;

import org.junit.Test;

public class WithAnnotationTest {

    @Test(timeout = 1000)
    public void testWithTimeout() {
        System.out.println("Test with timeout");
    }

}
