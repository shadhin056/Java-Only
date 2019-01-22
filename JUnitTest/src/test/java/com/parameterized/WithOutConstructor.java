package com.parameterized;

import java.awt.im.InputContext;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class WithOutConstructor {

	@Parameters
	public static Collection<Object[]> simplePass() {
		return Arrays.asList(new Object[][] {

				{ 0, 0 }, { 1, 1 }, { 2, 1 }, { 3, 1 } });
	}

	@Parameter(value = 0)
	public int input;
	@Parameter(value = 1)
	public int output;

	@Test
	public void testMethod() {
		System.out.println("Input is " + input + " Output is " + output);
	}
}
