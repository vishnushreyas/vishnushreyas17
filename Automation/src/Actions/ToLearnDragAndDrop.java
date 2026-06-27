package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnDragAndDrop {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		
		WebElement source = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
		
		//Perform Drag And Drop without using dragAndDrop()
		act.clickAndHold(source).moveToElement(target).release().perform();
	}
}