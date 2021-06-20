package test;

import org.testng.annotations.Test;

public class Testcase2 {

	@Test(description = "Verify that HomePage functionality is working fine", groups= {"Regression"})
	public void HomePageTest() {
		
		System.out.println("Inside HomePageTest");
		
	}
	
	@Test(dependsOnMethods="HomePageTest")
	public void HomePageTest1() {
		
		System.out.println("Inside HomePageTest1");
		
	}
	
	@Test(dependsOnMethods="HomePageTest1")
	public void HomePageTest2() {
		
		System.out.println("Inside HomePageTest2");
		
	}
	
	

}
