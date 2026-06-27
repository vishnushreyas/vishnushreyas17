package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[text()='Twitter']")).click();
		
		Set<String> links = driver.getWindowHandles();
		for(String l : links){
			driver.switchTo().window(l);
			
			String url = driver.getCurrentUrl();
			if(url.equals("https://x.com/nopCommerce")){
				driver.findElement(By.xpath("//span[text()='Create account']")).click();
				driver.findElement(By.xpath("//input[@name='username_or_email']")).sendKeys("shreyasdhamodharan17@gmail.com");
				driver.findElement(By.xpath("//p[text()='Continue']")).click();
			}
		}
	}
}