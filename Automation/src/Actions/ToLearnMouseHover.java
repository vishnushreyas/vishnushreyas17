package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnMouseHover {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://homeloans.hdfc.bank.in/");
		
		//WebElement login = driver.findElement(By.xpath("//a[@class='exist-custo-menu-link']"));
		Actions act = new Actions(driver);
		//act.moveToElement(login).perform();
		
		//driver.findElement(By.xpath("//a[@title='Login To NetBanking']")).click();
		
		Point loc = driver.findElement(By.xpath("//a[@class='exist-custo-menu-link']")).getLocation();
		int x = loc.getX();
		int y = loc.getY();
		act.moveByOffset(x, y).perform();
		
		driver.close();
	}
}
