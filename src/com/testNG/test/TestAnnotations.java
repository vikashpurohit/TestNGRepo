package com.testNG.test;

import org.testng.annotations.*;

public class TestAnnotations {
	@Test
	public void f1() {
		System.out.println("inside f1");
	}
	@Test
	public void F2() {
		System.out.println("inside f2");
	}
	@BeforeTest
	public void beforeAnyTest() {
		System.out.println("before any test");
	} 
	@AfterTest
	public void afterAllTheTests() {
		System.out.println("after all the tests");
	}
	@BeforeMethod
	public void beforeEveryMethod() {
		System.out.println("Before every Test Method");
	}
	@AfterMethod
	public void afterEveryMethod() {
		System.out.println("after every test method");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("befor class");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("after class");
	}
}
