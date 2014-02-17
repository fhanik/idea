package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTests
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTests(String testName)
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTests.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        String property = System.getProperty("spring.profiles.active");
        assertTrue(property == null || property.trim().length() == 0);
    }
}
