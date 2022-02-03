package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Practice {
	@BeforeClass
	public void beforeClass() {
		System.out.println("in method before class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("in method after class");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("In method before test");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("In method before Method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("In method ater Method");
	}
	@Ignore
	@Test
	public void test1() {
		
		System.out.println("In method test1");
	}
	@Test
	public void test2() {
		
		System.out.println("In method test2");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("In method after test");
	}
}
