package Assignment;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterInDemoWebShop {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");

	driver.findElement(By.className("ico-register")).click();
	
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.id("FirstName")).sendKeys("Vishnu");
	driver.findElement(By.id("LastName")).sendKeys("Shreyas D");

	driver.findElement(By.name("Email")).sendKeys("shreyasdhamodharan17@gmail.com");

	driver.findElement(By.id("Password")).sendKeys("Vishnu@1017");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("Vishnu@1017");

	driver.findElement(By.id("register-button")).click();


	}

}

