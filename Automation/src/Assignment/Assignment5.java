package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");
		
		WebElement price = driver.findElement(By.xpath("//span[text()='iphone']/..//p[contains(@class,'CalculateOffer_wrapper__2XD4R')]"));
		System.out.println(price.getText());
		
		driver.findElement(By.xpath("//span[text()='iphone']/../..//button[@type='button']")).click();
	}
}
