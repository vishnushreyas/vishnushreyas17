package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathOnAbhibus {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[placeholder='Leaving From']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//input[placeholder='Going To']")).sendKeys("Thanjavur");
		driver.findElement(By.xpath("//span[text()='Search']")).click();
	}
}
