package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnDragAndDropOnAutoDemoSite {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.automationtesting.in/Static.html");
		
		WebElement tIteam = driver.findElement(By.xpath("//img[@src='logo.png']"));
		WebElement tarea = driver.findElement(By.id("droparea"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(tIteam, tarea).perform();
		
		WebElement tItem2 = driver.findElement(By.xpath("(//img[@src='original.png'])[2]"));
		act.clickAndHold(tItem2).moveToElement(tarea).release().perform();
	}
}
