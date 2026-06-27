package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {
	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("mobiles",Keys.ENTER);
		driver.findElement(By.xpath("(//div[text()='Samsung Galaxy F70e 5G (Limelight Green, 128 GB)']/../..//div[text()='Bank Offer'])[1]")).click();
		
		Set<String> allWinId = driver.getWindowHandles();
		for(String id:allWinId) {
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			if (url.contains("https://www.flipkart.com/samsung-galaxy-f70e-5g-limelight-green-")) {
				
				WebElement dis = driver.findElement(By.xpath("(//h1[text()='Samsung Galaxy F70e 5G (Limelight Green, 128 GB) (6 GB RAM)']/../../../../../../../../../../../..//div[contains(text(),'%')])[3]"));
				System.out.println(dis.getText());
			}
		}
	}
}
