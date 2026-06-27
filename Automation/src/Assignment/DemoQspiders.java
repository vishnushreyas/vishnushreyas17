package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemoQspiders {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//p[text() = 'UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text() = 'Dropdown']")).click();
		driver.findElement(By.xpath("//a[text() = 'Multi Select']")).click();
		
		WebElement sel = driver.findElement(By.id("select-multiple-native"));
		
		org.openqa.selenium.support.ui.Select ele = new org.openqa.selenium.support.ui.Select(sel);
		
		ele.selectByVisibleText("Fjallraven - Foldsac...");
		ele.selectByVisibleText("Mens Cotton Jacket...");
		ele.selectByVisibleText("Mens Casual Premium ...");
		
		List<WebElement> op = ele.getAllSelectedOptions();
		for(WebElement el : op) 
		{
			System.out.println(el.getText());
		}
		System.out.println();
		
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		
		driver.findElement(By.xpath("//a[text()='Disabled']")).click();
		
	}

}
