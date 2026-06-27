package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.amazon.in/");
			
			driver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("iPhone Air");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
			List<WebElement> MobileName = driver.findElements(By.xpath("//span[contains(text(),'iPhone Air ')]"));
			List<WebElement> Price = driver.findElements(By.xpath("//span[contains(text(),'iPhone Air ')]/../../../..//span[contains(text(),'₹')]"));
			for(WebElement m:MobileName) {
				System.out.println(m.getText());
			}
			for(WebElement p:Price) {
				System.out.println(p.getText());
			}
		}
}
