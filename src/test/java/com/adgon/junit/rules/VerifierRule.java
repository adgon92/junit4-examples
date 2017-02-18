package com.adgon.junit.rules;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Verifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.experimental.results.PrintableResult.testResult;
import static org.junit.experimental.results.ResultMatchers.isSuccessful;

/**
 * can turn otherwise passing test methods into failing tests if a verification check is failed.
 */
public class VerifierRule {

    private static String sequence;

    @Rule
    public final Verifier collector = new Verifier() {
        @Override
        protected void verify() throws Throwable {
            sequence += "verify";
        }
    };

    @Test
    public void example() {
        sequence += "test1";
    }

    @Test
    public void verifierRunsAfterTest() {
        sequence = "";
        assertThat(testResult(VerifierRule.class), isSuccessful());
        assertEquals("test1 verify", sequence);
    }

}
