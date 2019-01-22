package com.parameterized;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class WithIndex {
	private int input;
	private int output;

	@Parameters(name="{index}:show({0}):{1}")
	public static Collection<Object[]> simplePass() {
		return Arrays.asList(new Object[][] {

				{ 0, 0 }, { 1, 1 }, { 2, 1 }, { 4, 1 } });
	}

	public WithIndex(int input, int output) {
		this.input = input;
		this.output = output;
	}

	@Test
	public void testMethod() {
		System.out.println("Input is " + input + " Output is " + output);
	}
}
