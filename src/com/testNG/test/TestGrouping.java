package com.testNG.test;

import org.testng.annotations.Test;

public class TestGrouping {

	@Test(groups= {"A"})
	public void f1() {
	}

	@Test(groups= {"B"})
	public void f2() {
	}

	@Test(groups= {"C"})
	public void f3() {
	}

	@Test(groups= {"A"})
	public void f4() {
	}

	@Test(groups= {"C"})
	public void f5() {
	}

	@Test(groups= {"A"})
	public void f6() {
	}
}
