package com.basic.anotation;

import static org.junit.Assert.*;

import org.junit.Test;

public class TimeOutTest {
	@Test(timeout=2000)
	public void test() throws InterruptedException {
		Thread.sleep(1000);
	}
}
