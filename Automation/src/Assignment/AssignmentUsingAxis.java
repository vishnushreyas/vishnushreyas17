package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentUsingAxis {
	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://blazedemo.com/");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement price = driver.findElement(By.xpath("//td[text()='Aer Lingus']/following-sibling::td[3]"));
		System.out.println(price.getText());
		
		driver.findElement(By.xpath("//td[text()='Aer Lingus']/..//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Vishnu Shreyas");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("Vishnu Shreyas");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Vishnu Shreyas");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Vishnu Shreyas");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Vishnu Shreyas");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Vishnu Shreyas");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Vishnu Shreyas");
	}
}
