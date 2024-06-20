package demo;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo3 {
	@Test(groups = "smoke")
	public void ApiTest() {
		System.out.println("apiTest");
	}
	@Test
	public void loginApiTest() {
		System.out.println("Login apiTest");
	}
	@Test
	public void mobile1() {
		System.out.println("Mob 1");
	}
	@Test
	public void mobile2() {
		System.out.println("Mob 2");
	}
	@Test
	public void failTest() {
		Assert.assertTrue(false);
		// intentionally failing a test to check listener
		
	}
	
	@Test(groups = "smoke")
	public void mobile3() {
		System.out.println("Mob 3");
	}
	@BeforeTest
	public void prerequisite() {
		System.out.println("This will run first because this comes in @BeforeTest");
	}
	@AfterTest
	public void postRequisite() {
		System.out.println("this will comes last, scope: Module");
	}
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("beforeSuit");
	}
	@AfterSuite
	public void afterSuit() {
		System.out.println("after suit");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("i will execute before every method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("i will execute after every method annota");
	}
	
	

}
