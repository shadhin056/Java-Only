package com.basic.anotation;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class ErrorTestJava {
	@Ignore
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void testOneMethod() {

		System.out.println("Inside the testOneMethod");
	}

	@Ignore
	public void testTwoMethod() {

		//System.out.println("Inside the testTwoMethod");
	throw new ArrayIndexOutOfBoundsException();
	}

	@Test(expected=IllegalAccessError.class)
	public void testThreeMethod() {
		//System.out.println("Inside the testThreeMethod");
		throw new IllegalAccessError();
	}
}
