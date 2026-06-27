package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttributeOnDemoWebShop {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//input[@name='NewsletterEmail']")).sendKeys("shreyasdhamodharan17@gmail.com");
		driver.findElement(By.xpath("//input[@value='Subscribe']")).click();
		
		driver.quit();
	}
	
}