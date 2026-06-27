package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchingIntoTheFrame {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.rediff.com/");
		
		//driver.switchTo().frame("moneyiframe");	
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='moneyiframe']"));
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.xpath("//span[text()='BSE']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
	}
}