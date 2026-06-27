package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnHardAssert {
	@Test
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		//verify home page is displayed
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop", "WelocmePage is not displayed");
		Reporter.log("WelcomePage is Displayed",true);
		
		driver.findElement(By.linkText("Log in")).click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Login ", "WelocmePage is not displayed");
		Reporter.log("WelcomePage is Displayed",true);
		
		//verify login page is displayed 
		boolean status = driver.findElement(By.xpath("//a[text()='Log in']")).isDisplayed();
		Assert.assertEquals(status, true);
		
		driver.findElement(By.id("Email")).sendKeys("shreyasdhamodharan17@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Vishnu@1017");
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
		
		
	}
}
