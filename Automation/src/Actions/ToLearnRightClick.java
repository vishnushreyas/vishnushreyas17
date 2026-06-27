package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnRightClick {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement button = driver.findElement(By.xpath("//*[.='right click me']"));
		Actions act = new Actions(driver);
		act.contextClick(button).perform();
		
		driver.findElement(By.xpath("//span[text()='Edit']")).click();	
		
		driver.quit();
	}
}


