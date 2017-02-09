package org.MultiModelB;
import org.MultiModelA.ModelA;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
		a = new ModelA();
		a.setAppName("MultiModelA");

	    System.out.println( "Hello World!" );
	    System.out.println(a.getAppname());
        assertTrue(a.AppName.equals("MultiModelA"));
        b = new ModelB();
		b.setAppName("MultiModelB");

	    System.out.println( "Hello World!" );
	    System.out.println(b.getAppname());
        assertTrue(b.AppName.equals("MultiModelA"));
    }
}
