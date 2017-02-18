package com.adgon.junit.theories;

import com.adgon.junit.User;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;
import static org.junit.Assume.assumeThat;

@RunWith(Theories.class)
public class BasicTheory {

    @DataPoint
    public static String GOOD_USERNAME = "optimus";

    @DataPoint
    public static String USERNAME_WITH_SLASH = "optimus/prime";

    /**
     * UserTest will attempt to run filenameIncludesUsername on every compatible DataPoint defined in the class.
     * If any of the assumptions fail, the data point is silently ignored.
     * If all of the assumptions pass, but an assertion fails, the test fails.
     */
    @Theory
    public void filenameIncludesUsername(String username) {
        assumeThat(username, not(containsString("/")));
        assertThat(new User(username).getConfigFileName(), containsString(username));
    }

}
