package com.category;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(FastClass.class)
public class ClassTwo {
	@Test
	public void twoMethodOne() {

		System.out.println("Inside The class Two method One");
	}

	@Test
	public void twoMethodTwo() {

		System.out.println("Inside The class Two method Two");
	}
}
