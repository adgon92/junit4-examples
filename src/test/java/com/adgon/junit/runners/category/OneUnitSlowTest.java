package com.adgon.junit.runners.category;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class OneUnitSlowTest {

    @Test
    public void quickUnitTest() {
    }

    @Category(SlowTest.class)
    @Test
    public void slowUnitTest() {
    }

}
