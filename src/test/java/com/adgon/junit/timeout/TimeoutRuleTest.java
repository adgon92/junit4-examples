package com.adgon.junit.timeout;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Timeout rule applies to all test cases in the test class
 * <p>
 * The timeout specified in the Timeout rule applies to the entire test fixture,
 * including any @Before or @After methods. If the test method is in an
 * infinite loop (or is otherwise not responsive to interrupts) then @After methods will not be called.
 */
public class TimeoutRuleTest {

    private static String log;
    private final CountDownLatch latch = new CountDownLatch(1);

    @Rule
    public Timeout globalTimeout = Timeout.seconds(10);

    @Test
    public void testSleepForTooLong() throws Exception {
        log += "ran1";
        TimeUnit.SECONDS.sleep(100);
    }

    @Test
    public void testBlockForever() throws Exception {
        log += "ran2";
        latch.await(); // will block
    }

}
