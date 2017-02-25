package com.adgon.junit.categories;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(SlowTest.class)
@Suite.SuiteClasses({OneTestIncludedInCategoryTest.class, BothCategoriesTest.class})
public class SlowTestSuite {
    // won't run OneTestIncludedInCategoryTest.a()
}
