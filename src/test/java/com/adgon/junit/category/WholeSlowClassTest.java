package com.adgon.junit.category;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(SlowTest.class)
public class WholeSlowClassTest {

    @Test
    public void unit1() {
    }

}
