package com.adgon.junit.rules;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

/**
 * The ErrorCollector Rule allows execution of a test to continue after the first problem is found
 */
public class ErrorCollectorRule {

    @Rule
    public final ErrorCollector collector = new ErrorCollector();

    @Test
    public void example() {
        collector.addError(new Exception("Err1"));
        collector.addError(new Exception("Err2"));
    }

}
