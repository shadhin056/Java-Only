package com.basic.anotation;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BeforeAndAfter.class, ErrorTestJava.class, TimeOutTest.class })
public class AllTests {

}
