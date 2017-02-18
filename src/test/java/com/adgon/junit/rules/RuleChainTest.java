package com.adgon.junit.rules;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;
import org.junit.rules.RuleChain;
import org.junit.rules.TestRule;

import static org.junit.Assert.assertTrue;

public class RuleChainTest {

    @Rule
    public final TestRule chain = RuleChain
            .outerRule(new LoggingRule("outer"))
            .around(new LoggingRule("middle"))
            .around(new LoggingRule("inner"));

    @Test
    public void example() {
        assertTrue(true);
    }

    private class LoggingRule extends ExternalResource {

        private final String levelDescription;

        LoggingRule(String levelDescription) {
            this.levelDescription = levelDescription;
        }

        @Override
        protected void after() {
            System.out.println("Stopping " + levelDescription + "rule.");
        }

        @Override
        protected void before() throws Throwable {
            System.out.println("Starting " + levelDescription + "rule.");
        }

    }
}
