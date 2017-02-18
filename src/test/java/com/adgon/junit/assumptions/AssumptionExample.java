package com.adgon.junit.assumptions;

import lombok.Value;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.theInstance;
import static org.junit.Assume.assumeThat;
import static org.junit.Assume.assumeTrue;

public class AssumptionExample {

    @BeforeClass
    public static void setUpClass() {
        // Will cause whole test class to be ignored
        assumeThat("Something", theInstance(Number.class));
    }

    @Before
    public void setUp() {
        // Will cause whole test class to be ignored
        assumeThat("Something", theInstance(Number.class));
    }

    @Test
    public void filenameIncludesUsername() {
        assumeThat(File.separatorChar, is('/'));
        assumeThat(new User("optimus").configFileName, is("config/optimus.conf"));
    }

    @Test
    public void correctBehaviorWHenFileNameIsNull() {
        //noinspection ConstantConditions
        assumeTrue(false);
        assumeThat(new Object(), is(""));
    }

    @Value
    private class User {
        String configFileName;
    }
}
