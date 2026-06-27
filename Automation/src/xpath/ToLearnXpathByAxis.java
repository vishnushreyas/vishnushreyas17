package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByAxis {
	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/shrey/OneDrive/Desktop/movies.html");
		
		WebElement l = driver.findElement(By.xpath("//td[text()='Dhurandhar']/following-sibling::td[2]"));
		System.out.println(l.getText());
		WebElement m = driver.findElement(By.xpath("//td[text()='Billa']/following-sibling::td[2]"));
		System.out.println(m.getText());
		WebElement n = driver.findElement(By.xpath("//td[text()='Attagasam']/following-sibling::td[2]"));
		System.out.println(n.getText());
		
		System.out.println("----------------------------");
		
		WebElement l1 = driver.findElement(By.xpath("//td[text()='Dhurandhar']/following-sibling::td[1]"));
		System.out.println(l1.getText());
		WebElement m1 = driver.findElement(By.xpath("//td[text()='Billa']/following-sibling::td[1]"));
		System.out.println(m1.getText());
		WebElement n1 = driver.findElement(By.xpath("//td[text()='Attagasam']/following-sibling::td[1]"));
		System.out.println(n1.getText());
		
		System.out.println("----------------------------");
		
		WebElement l2 = driver.findElement(By.xpath("//td[text()='Dhurandhar']/preceding-sibling::td[1]"));
		System.out.println(l2.getText());
		WebElement m2 = driver.findElement(By.xpath("//td[text()='Billa']/preceding-sibling::td[1]"));
		System.out.println(m2.getText());
		WebElement n2 = driver.findElement(By.xpath("//td[text()='Attagasam']/preceding-sibling::td[1]"));
		System.out.println(n2.getText());
	}
}