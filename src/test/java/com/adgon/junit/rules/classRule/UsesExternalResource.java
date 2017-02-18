package com.adgon.junit.rules.classRule;

import com.adgon.junit.rules.Server;
import org.junit.ClassRule;
import org.junit.rules.ExternalResource;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


/**
 * Test suite that connects to a server once before all the test classes run,
 * and disconnects after are finished
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({A.class, B.class, C.class})
public class UsesExternalResource {

    private static final Server myServer = new Server();

    @ClassRule
    public static final ExternalResource resource = new ExternalResource() {
        @Override
        protected void before() throws Throwable {
            myServer.connect();
        }

        @Override
        protected void after() {
            myServer.disconnect();
        }
    };

}
