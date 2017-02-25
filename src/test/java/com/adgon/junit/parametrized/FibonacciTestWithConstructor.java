package com.adgon.junit.parametrized;

import com.adgon.junit.runners.parametrized.Fibonacci;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FibonacciTestWithConstructor {

    private int fInput;
    private int fExpected;

    public FibonacciTestWithConstructor(int fInput, int fExpected) {
        this.fInput = fInput;
        this.fExpected = fExpected;
    }

    @Parameterized.Parameters(name = "{index}: fib[{0}]={1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, 0}, {1, 1}, {2, 1}, {3, 2}, {4, 3}, {5, 5}
        });
    }

    @Test
    public void test() {
        assertEquals(fExpected, Fibonacci.compute(fInput));
    }

}