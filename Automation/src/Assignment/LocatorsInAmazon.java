package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInAmazon {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(15000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
		
		Thread.sleep(15000);
		
		driver.findElement(By.className("nav-input nav-progressive-attribute")).click();
		
		List<WebElement> image = driver.findElements(By.tagName("img"));
		System.out.println(image.size());
	}

}
