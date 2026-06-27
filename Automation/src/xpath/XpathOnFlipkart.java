package xpath;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathOnFlipkart {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("Mobile");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("(//div[text()='Bank Offer'])[1]")).click();
		
		Set<String> allWinID = driver.getWindowHandles();
		for(String id : allWinID)
		{
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			
			if(url.contains("https://www.flipkart.com/iqoo-z11x-5g-prismatic-green-128-gb/p/itm8157cfb5645d4?pid=MOBHHHBTGHWHZZWN&lid=LSTMOBHHHBTGHWHZZWNDSWLYL&marketplace=FLIPKART&q=Mobile&store=tyy%2F4io&srno=s_1_2&otracker=search&otracker1=search&fm=organic&iid=1416f8d2-aadb-420a-8dac-fee5dfbfe24d.MOBHHHBTGHWHZZWN.SEARCH&ppt=hp&ppn=homepage&ssid=3jg5myzr680000001775195635926&qH=87d17f4624a514e8&ov_redirect=true"));
			{
				driver.findElement(By.xpath(url));
			}
		}
	}

}
