package org.jfree.data;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.jfree.data.DataUtilities;
import org.jfree.data.DefaultKeyedValues2D;
import org.jfree.data.Values2D;
import junit.framework.TestCase;

public class DataUtilitiesTest extends TestCase {
	private Values2D values2D;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp()
	{
	    DefaultKeyedValues2D testValues = new DefaultKeyedValues2D();
	    values2D = testValues;
	    testValues.addValue(1, 0, 0);
	    testValues.addValue(4, 1, 0);
	}

	@After
	public void tearDown() throws Exception {
		values2D = null;
	}
	

	@Test
	public void testValidDataAndColumnColumnTotal()
	{
		assertEquals("Wrong sum returned. It should be 5.0",  
			     5.0, DataUtilities.calculateColumnTotal(values2D, 0), 0.0000001d);
		}
	
	public void testNullDataColumnTotal()
	{
		try
		{
			DataUtilities.calculateColumnTotal(null, 0);
			fail("No exception thrown");
		}
		catch (Exception e)
		{
			assertTrue("Incorrect exception type thrown", 
					e.getClass().equals(InvalidParameterException.class));
		}
	}
}
