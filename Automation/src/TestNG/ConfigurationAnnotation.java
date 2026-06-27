package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotation {
	@BeforeSuite
	public void beforesuite() {
		Reporter.log("BeforeSuite is executed",true);
	}
	
	@AfterSuite
	public void aftersuite() {
		Reporter.log("AfterSuite is executed",true);
	}
	
	@BeforeTest
	public void beforetest() {
		Reporter.log("Beforetest is executed",true);
	}
	
	@AfterTest
	public void aftertest() {
		Reporter.log("Aftertest is executed",true);
	}
	
	@BeforeClass
	public void beforeclass() {
		Reporter.log("Beforeclass is executed",true);
	}
	
	@AfterClass
	public void afterclass() {
		Reporter.log("Afterclass is executed",true);
	}
	
	@BeforeMethod
	public void beforemethord() {
		Reporter.log("Beforemethord is executed",true);
	}
	
	@AfterMethod
	public void aftermethord() {
		Reporter.log("Aftermethord is executed",true);
	}
	
	@Test
	public void test() {
		Reporter.log("Trest is executed",true);
	}
}
