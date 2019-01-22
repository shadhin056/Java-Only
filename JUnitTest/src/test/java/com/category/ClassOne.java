package com.category;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ClassOne {
	@Category(SlowClass.class)
	@Test
	public void oneMethodOne() {

		System.out.println("Inside The class One method One");
	}

	@Category({ FastClass.class, Mediam.class })
	@Test
	public void oneMethodTwo() {

		System.out.println("Inside The class One method Two");
	}
}
