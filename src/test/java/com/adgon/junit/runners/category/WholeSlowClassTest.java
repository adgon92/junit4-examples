package com.adgon.junit.runners.category;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(SlowTest.class)
public class WholeSlowClassTest {

    @Test
    public void unit1() {
    }

}
