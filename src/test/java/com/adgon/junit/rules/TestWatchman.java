package com.adgon.junit.rules;

import org.junit.AssumptionViolatedException;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import static org.junit.Assert.fail;

/**
 * For example, this class will keep a log of each passing and failing test
 */
public class TestWatchman {

    private static String watchedLog;

    @Rule
    public final TestRule watchman = new TestWatcher() {

        @Override
        protected void succeeded(Description description) {
            watchedLog += description.getDisplayName() + " " + "success!\n";
        }

        @Override
        protected void failed(Throwable e, Description description) {
            watchedLog += description.getDisplayName() + " " + e.getClass().getSimpleName() + "\n";
        }

        @Override
        protected void skipped(AssumptionViolatedException e, Description description) {
            watchedLog += description.getDisplayName() + " " + e.getClass().getSimpleName() + "\n";
        }

        @Override
        protected void starting(Description description) {
            System.out.println("Starting test case...");
            super.starting(description);
        }

        @Override
        protected void finished(Description description) {
            super.finished(description);
            System.out.println("Test case finished.");
            System.out.println(watchedLog);
        }
    };

    @Test
    public void fails() {
        fail();
    }

    @Test
    public void succeeds() {
        System.out.println("PASS");
    }

    @Ignore
    @Test
    public void ignored() {
        System.out.printf("IGNORE");
    }

}
