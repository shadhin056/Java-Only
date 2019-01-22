package com.basic.anotation;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeClassAndAfterClass {
	@BeforeClass
	public static  void beforeClassMethod() {
		
		System.out.println("inside the before class");
	}
	@AfterClass
	public static void afterClassMethod() {
		
		System.out.println("inside the after class");
	}
	@Before
	public void beforeMethod() {
		System.out.println("Inside the before");
	}
	
	@Test
	public void One() {
		System.out.println("One Test");
	}

	@Test
	public void Two() {
		System.out.println("Two Test");
	}

	@Test
	public void Three() {
		System.out.println("Three Test");
	}
	
	@After
	public void aftermethod()
	{
		System.out.println("Inside The after");
	}
}
