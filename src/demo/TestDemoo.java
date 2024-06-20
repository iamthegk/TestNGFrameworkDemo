package demo;

import org.testng.annotations.Test;

public class TestDemoo {
	@Test(groups ="regression")
	public void dummy() {
		System.out.println("dummy");
	}
	@Test
	public void dummyTest() {
		System.out.println("dependend module");
	}
	@Test(dependsOnMethods = {"dummy","dummyTest"}) /*this testng code is saying that the 
	method dummy 2 is depends on dummy
	so dummy will execute first then dummy*/
	public void dummy2() {
		System.out.println("depend method");
	}

}
