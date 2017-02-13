package com.adgon.junit.category;

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
