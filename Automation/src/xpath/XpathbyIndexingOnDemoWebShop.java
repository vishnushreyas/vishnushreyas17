package xpath;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbyIndexingOnDemoWebShop {
	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[text() = 'Facebook']")).click();
		
		Set<String> links = driver.getWindowHandles();
		for(String l : links){
			driver.switchTo().window(l);
			
			String url = driver.getCurrentUrl();
			if(url.equals("https://www.facebook.com/nopCommerce")){
				driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("shreyasdhamodharan17@gmail.com");
				driver.findElement(By.xpath("(//input[@name='pass'])[2]")).sendKeys("Vishnu@1017");
				driver.findElement(By.xpath("(//span[text()='Log in'])[3]")).click();
			}
		}
	}
}
