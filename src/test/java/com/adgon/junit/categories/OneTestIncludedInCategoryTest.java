package com.adgon.junit.categories;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class OneTestIncludedInCategoryTest {

    @Test
    public void a() {
    }

    @Category(SlowTest.class)
    @Test
    public void b() {
    }

}
