package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToLearnSoftAssert {
	@Test
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		//verify home page is displayed
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(driver.getTitle(), "Demo Web Shop. Login", "Homepage is not displayed");
		
		driver.findElement(By.id("Email")).sendKeys("shreyasdhamodharan17@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Vishnu@1017");
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
		soft.assertEquals(driver.getTitle(), "Demo Web Shop", "Homepage is Displayed");
		soft.assertAll();
		
	}
}