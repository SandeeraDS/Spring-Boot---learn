package com.sandeerads.junit_learn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
//import org.junit.jupiter.api.Test;
import org.junit.Test;

class MyMathTest {
	MyMath math = new MyMath();
	
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After");
	}
	
	@Test
	public void sum_with3numbers() {
		System.out.println("Test 01");
//		assertEquals(6, math.sum(new int[] {1,2,3}));
	}
	@Test
	public void sum_with1numbers() {
		System.out.println("Test 02");
//		assertEquals(3, math.sum(new int[] {3}));
	}

}
