package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentOnBlazerDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://blazedemo.com/");
		
		WebElement drop = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select ele = new Select(drop);
		ele.selectByVisibleText("Portland");
		
		WebElement drop1 = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select ele1 = new Select(drop1);
		ele1.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
	}

}
