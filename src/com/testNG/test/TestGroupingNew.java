package com.testNG.test;

import org.testng.annotations.Test;

public class TestGroupingNew {
	
	@Test(groups= {"B"})
	public void m1() {
	}

	@Test(groups= {"D"})
	public void m2() {
	}

	@Test(groups= {"D"})
	public void m3() {
	}

	@Test(groups= {"D"})
	public void m4() {
	}
}
