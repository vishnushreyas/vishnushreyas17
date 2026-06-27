package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://homeloans.hdfc.bank.in/");
		
		driver.findElement(By.xpath("//a[@title='Login']")).click();
		driver.findElement(By.xpath("(//a[@title='Login To NetBanking'])[1]")).click();
		
		Set<String> links = driver.getWindowHandles();
		for(String l : links){
			driver.switchTo().window(l);
			
			String url = driver.getCurrentUrl();
			if(url.equals("https://www.hdfc.bank.in/ways-to-bank/digital-banking/online-banking/netbanking")){
				driver.findElement(By.xpath("(//button[text()='Login'])[1]")).click();
				driver.findElement(By.xpath("(//span[text()='NetBanking'])[1]")).click();
				
				Set<String> link = driver.getWindowHandles();
				for(String al : link){
					driver.switchTo().window(al);
					
					String urls = driver.getCurrentUrl();
					if(urls.contains("now.hdfc.bank.in")){
						driver.findElement(By.xpath("//input[@name='username']")).sendKeys("vishnushreyas");
						driver.findElement(By.xpath("//input[@name='password']")).sendKeys("vishnushreyas");
						driver.findElement(By.xpath("//input[@type='submit']")).click();
					}
				}
			}
		}
	}
}