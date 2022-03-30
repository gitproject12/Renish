package com.git;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit {
	@BeforeClass
	public static void Beforeclass() {
		System.out.println("Before class");	
	}
	@AfterClass
	public static void Afterclass() {
		System.out.println("After class");	

	}
	@Before
	public void Starts() {
		System.out.println("Start");	
	}
	@After
	public void Ends() {
		System.out.println("ends");	

	}
	@Test
	public void Test1() {
		System.out.println("Test1");	
		

	}
	@Test
	public void Test2() {
		System.out.println("Test2");
	}
	@Test
	public void Test3() {
		System.out.println("Test3");
	}
	
	

	

}
