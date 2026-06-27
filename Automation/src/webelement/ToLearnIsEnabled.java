package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsEnabled {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/52");
		
		Thread.sleep(20000);
		
		boolean status = driver.findElement(By.xpath("//button[@name='Check']")).isEnabled();
		System.out.println(status);
		
		
		
	}
}
