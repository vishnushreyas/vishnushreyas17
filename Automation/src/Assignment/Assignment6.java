package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.abhibus.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='Leaving From']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Bangalore')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Going To']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Hyderabad')]")).click();
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		
		List<WebElement> BusName = driver.findElements(By.xpath("//h5[@class='title']"));
		List<WebElement> DepatureTime = driver.findElements(By.xpath("//span[contains(@class,'departure-time')]"));
		List<WebElement> ArrivalTime = driver.findElements(By.xpath("//span[contains(@class,'arrival-time')]"));
		List<WebElement> PriceOfBus = driver.findElements(By.xpath("//span[contains(@class,'fare')]"));
		List<WebElement> SeatsAvaliable = driver.findElements(By.xpath("//div[contains(@id,'service-operator-sele')]/..//div[contains(@style,'text-align')]"));
		
		for(int i=0;i<BusName.size();i++) {
			String bu = BusName.get(i).getText();
			String dt = DepatureTime.get(i).getText();
			String at = ArrivalTime.get(i).getText();
			String pb = PriceOfBus.get(i).getText();
			String sa = SeatsAvaliable.get(i).getText();
			
			System.out.println(bu+ dt+ at+ pb+ sa);
		}
		
	}
}
