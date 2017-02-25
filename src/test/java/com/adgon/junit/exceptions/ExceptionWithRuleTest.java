package com.adgon.junit.exceptions;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionWithRuleTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldThrow() {
        TestThing testThing = new TestThing();
        thrown.expect(SomeException.class);
        thrown.expectMessage("Cause desc");
        testThing.run();
    }

    private class TestThing {
        void run() {
            throw new SomeException("Message");
        }
    }

    private class SomeException extends RuntimeException {
        SomeException(String message) {
            super(message);
        }
    }

}
