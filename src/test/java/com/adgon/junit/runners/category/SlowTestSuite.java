package com.adgon.junit.runners.category;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(SlowTest.class)
//@Categories.ExcludeCategory({FastTest.class})   Not necessary here
@Suite.SuiteClasses({BothCategoriesTest.class, WholeSlowClassTest.class})
public class SlowTestSuite {
}

/*
Categories can also be used directly in Maven, Gradle, STB.
Example for maven:

<build>
  <plugins>
    <plugin>
      <artifactId>maven-surefire-plugin</artifactId>
      <configuration>
        <groups>com.example.FastTests,com.example.RegressionTests</groups>
      </configuration>
    </plugin>
  </plugins>
</build>

 */
