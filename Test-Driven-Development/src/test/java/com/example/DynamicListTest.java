package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DynamicListTest {
	private DynamicList d;
	
	@Before
	public void setUp() throws Exception {
		d=new DynamicList();
		
	}
	
	@After
	public void tearDown() throws Exception {
		d=null;
	}
	
	@Test
	public void testAdd() {
			d.add(10);
			d.add(100);
			d.add(200);
			assertEquals(3,d.size());
	}
	
	@Test
	public void testAdd1() {
			assertEquals(0,d.size());
	}
	@Test
	public void testToString() {
		d.add(10);
		d.add(11);
		String s="[10,11]";
		assertEquals(s,d.toString());
	}
	
	@Test
	public void testToString1() {
		d.add(10);
		d.add(11);
		d.add(10);
		d.add(11);
		String s="[10,11,10,11]";
		assertEquals(s,d.toString());
	}
	
	@Test
	public void testRemove() {
		d.add(10);
		d.add(11);
		d.add(12);
		d.add(13);
		d.remove(2);
		assertEquals(3,d.size());
		String s="[10,11,13]";
		assertEquals(s,d.toString());
	}
	
}
