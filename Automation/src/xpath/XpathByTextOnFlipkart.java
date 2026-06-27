package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByTextOnFlipkart {
    public static void main(String[] args) {
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	driver.get("https://www.flipkart.com/");
    	
    	driver.findElement(By.xpath("//span[@role='button']")).click();
    	//using text
    	driver.findElement(By.xpath("//div[text()='Fashion']")).click();
    	
    	driver.quit();
		
	}
}