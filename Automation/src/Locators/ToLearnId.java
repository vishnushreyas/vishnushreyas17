package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnId {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.id("small-searchterms")).sendKeys("books");
		driver.findElement(By.id("newsletter-email")).sendKeys("shreyasdhamodharan17@gmail.com");
		driver.findElement(By.id("newsletter-subscribe-button")).click();
		driver.quit();
	}
}	