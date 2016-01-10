package com.franktan.joketeller;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by tan on 10/01/2016.
 */
public class JokeTellerTest {

    @Test
    public void testTellJoke() throws Exception {
        assertNotNull("JokeTeller cannot supply a joke", JokeTeller.tellJoke());
        assertTrue("JokeTeller tells an empty joke", JokeTeller.tellJoke().length() > 0);
    }
}