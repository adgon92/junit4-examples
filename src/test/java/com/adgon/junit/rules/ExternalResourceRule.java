package com.adgon.junit.rules;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;

public class ExternalResourceRule {

    private Server server = new Server();

    @Rule
    public final ExternalResource resource = new ExternalResource() {
        @Override
        protected void before() throws Throwable {
            server.connect();
        }

        @Override
        protected void after() {
            server.disconnect();
        }
    };

    @Test
    public void testFoo() {
        new Client().run(server);
    }


}
