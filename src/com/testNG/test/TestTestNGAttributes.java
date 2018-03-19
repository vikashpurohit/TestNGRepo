package com.testNG.test;

import org.testng.annotations.Test;

public class TestTestNGAttributes {
	/*NOTE :if a has no priority then run this scripti the result is- a d o m f
	but if i replace method a by e without priority then the result is - d e o m f 
*/	
	@Test (priority=0)
	public void d() {
	}

	@Test(dependsOnMethods= {"f"})
	public void a() {
	}

	@Test(priority=46)
	public void m() {
	}

	@Test(priority=10)
	public void o() {
	}

	@Test(enabled=false)
	public void f() {
	}
	
	@Test(priority=3)
	public void e() {
	}

}
