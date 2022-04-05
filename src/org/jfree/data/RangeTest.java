package org.jfree.data;

import junit.framework.TestCase;
import org.jfree.data.Range;
import org.junit.*;

import org.junit.Test;

public class RangeTest extends TestCase {
	
	private Range rangeObjectUnderTest;
	@Before
	protected void setUp() throws Exception {
		rangeObjectUnderTest = new Range(-1, 1);
	}

	@After
	protected void tearDown() throws Exception {
		
	}

	@Test
	public void testCentralValueShouldBeZero() {
		assertEquals("The central value of -1 and 1 should be 0", 0, rangeObjectUnderTest.getCentralValue(), 0.000000001d);
	}
	
	public void testGetLength() 
	{
	    Range r1 = new Range(2, 2);
	    assertEquals("getLength: Did not return the expected output", 0.0, r1.getLength());
	     
	    Range r2 = new Range(4, 9);
	    assertEquals("getLength: Did not return the expected output", 5.0, r2.getLength());
	    
	    Range r3 = new Range(-99,-99);
	    assertEquals("getLength: Did not return the expected output", 0.0, r3.getLength());
	     
	    Range r4 = new Range(-11, -4);
	    assertEquals("getLength: Did not return the expected output", 7.0, r4.getLength());
	    Range r5 = new Range(-5, 3);
	    assertEquals("getLength: Did not return the expected output", 8.0, r5.getLength());
	}
	
	 
	/*
	  @Test
	    public void testCombine() {
	        Range r1 = new Range(1.0, 2.0);
	        Range r2 = new Range(1.5, 2.5);

	        assertNull(Range.combine(null, null));
	        assertEquals(r1, Range.combine(r1, null));
	        assertEquals(r2, Range.combine(null, r2));
	        assertEquals(new Range(1.0, 2.5), Range.combine(r1, r2));

	        Range r3 = new Range(Double.NaN, 1.3);
	        Range rr = Range.combine(r1, r3);
	        assertTrue(Double.isNaN(rr.getLowerBound()));
	        assertEquals(2.0, rr.getUpperBound(), 0.000000001d);

	        Range r4 = new Range(1.7, Double.NaN);
	        rr = Range.combine(r4, r1);
	        assertEquals(1.0, rr.getLowerBound(), 0.000000001d);
	        assertTrue(Double.isNaN(rr.getUpperBound()));
	    }
	    */
	  @Test
	  public void testGetUpperBound()
	  {
		  Range testRange = new Range(-5.0,5.0);
		  assertEquals("Incorrect upper bound returned",5,testRange.getUpperBound());
		   
	  }
	 @Test
	 public void testGetUpperBound1()
	 {
		 Range testRange = new Range(-10.0,-5.0);
		 assertEquals("Incorrect upper bound returned",0,testRange.getUpperBound());
	 }
	 
	 @Test
	 public void testGetUpperBound2()
	 {
		 Range testRange = new Range(5.0,10.0);
		 assertEquals("Incorrect upper bound returned",10,testRange.getUpperBound());
	 }
	 
	 @Test
	 public void testGetUpperBound3()
	 {
		 Range testRange = new Range(5.0,5.0);
		 assertEquals("Incorrect upper bound returned",5,testRange.getUpperBound());
	 }
	 
	 @Test
	 public void testGetUpperBound4()
	 {
		 Range testRange = new Range(0.0,0.0);
		 assertEquals("Incorrect upper bound returned",0,testRange.getUpperBound());
	 }
	 
	 @Test
	 public void testGetUpperBound5()
	 {
		 Range testRange = new Range(-5.0,0.0);
		 assertEquals("Incorrect upper bound returned",0,testRange.getUpperBound());
	 }
	 
	 @Test
	 public void testGetUpperBound6()
	 {
		 Range testRange = new Range(-5.0,-5.0);
		 assertEquals("Incorrect upper bound returned",-5,testRange.getUpperBound()); 
	 }
	 
	 @Test
	 public void testGetUpperBound7()
	 {
		 Range testRange = new Range(5.0, null);
		 assertEquals("Incorrect upper bound returned", 5.0,testRange.getUpperBound());
	 }
	 
	 
	 @Test
	  public void testGetLowerBound()
	  {
		  Range testRange = new Range(-5.0,5.0);
		  assertEquals("Incorrect upper bound returned",-5,testRange.getUpperBound());
		   
	  }
	 @Test
	 public void testGetLowerBound1()
	 {
		 Range testRange = new Range(-10.0,-5.0);
		 assertEquals("Incorrect upper bound returned",-10,testRange.getUpperBound());
	 }
	 
	 @Test
	 public void testGetLowerBound2()
	 {
		 Range testRange = new Range(5.0,10.0);
		 assertEquals("Incorrect upper bound returned",5,testRange.getUpperBound());
	 }
	 
	 @Test
	 public void testGetLowerBound3()
	 {
		 Range testRange = new Range(5.0,5.0);
		 assertEquals("Incorrect upper bound returned",5,testRange.getUpperBound());
	 }
	 
	 @Test
	 public void testGetLowerBound4()
	 {
		 Range testRange = new Range(0.0,0.0);
		 assertEquals("Incorrect upper bound returned",0,testRange.getUpperBound());
	 }
	 
	 @Test
	 public void testGetLowerBound5()
	 {
		 Range testRange = new Range(-5.0,0.0);
		 assertEquals("Incorrect upper bound returned",-5,testRange.getUpperBound());
	 }
	 
	 @Test
	 public void testGetLowerBound6()
	 {
		 Range testRange = new Range(-5.0,-5.0);
		 assertEquals("Incorrect upper bound returned",-5,testRange.getUpperBound());
	 }
	 
	 @Test
	 public void testGetLowerBound7()
	 {
		 Range testRange = new Range(null, 5.0);
		 assertEquals("Incorrect upper bound returned", 5.0,testRange.getUpperBound());
	 }
	
	 
	  
	 
}
