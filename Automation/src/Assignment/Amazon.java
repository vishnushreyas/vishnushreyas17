package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		
		List<WebElement> image = driver.findElements(By.tagName("img"));
		System.out.println("Count of image :" + image.size());
		
		System.out.println(" ---------------------");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Count of the links is:" + links.size());
		
		System.out.println(" ---------------------");
		
		for(WebElement l : links)
		{
			System.out.println("name of the link : " + l.getText());
		}
		driver.quit();
	}
}
