package com.seliniumdemo.SeliniumTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestWorkLog {
	
	Worklog w1 = new Worklog();
	
	@Test
	public void testAddToLog1()
	{
		assertEquals("Added Log For Remo", w1.addToLog("Remo"));
	}
	
	@Test
	public void testAddToLog2()
	{
		assertEquals("Added Log For Lokesh", w1.addToLog("Lokesh"));
		
	}
	
	@Test
	public void testAddLogins1()
	{
		assertEquals("Added Login Log For Lokesh", w1.addLogins("Lokesh"));
		
	}
	
	@Test
	public void testAddLogins2()
	{
		assertEquals("Added Login Log For Sanjay", w1.addLogins("Sanjay"));
	}

}
