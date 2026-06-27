package TestNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerImplementation.class)
public class ListenersTestScript extends Baseclass {
	@Test
	public void login() {
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("shreyasdhamodharan17@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Vishnu@1017");
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		Assert.assertEquals(driver.getTitle(), "Demo", "Home page is not Displayed");
		Reporter.log("Home page is displayed",true);
	}
}
