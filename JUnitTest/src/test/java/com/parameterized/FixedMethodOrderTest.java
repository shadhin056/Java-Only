package com.parameterized;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FixedMethodOrderTest {
	@Test
	public void OneMethod() {
		System.out.println("This is One");
	}

	@Test
	public void TwoMethod() {
		System.out.println("This is two");
	}

	@Test
	public void ThreeMethod() {
		System.out.println("This is three");
	}

	@Test
	public void FourMethod() {
		System.out.println("This is four");
	}
}
