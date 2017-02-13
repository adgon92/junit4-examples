package com.adgon.junit.runners.category;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category({SlowTest.class, FastTest.class})
public class BothCategoriesTest {

    @Test
    public void unit1() {

    }

}
