package Popups;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandelFileIUploadPopUps {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		
		driver.findElement(By.id("fullName")).sendKeys("Vishnu Shreyas");
		driver.findElement(By.id("emailId")).sendKeys("shreyasdhamodharan17@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Vishnu@1017");
		driver.findElement(By.id("mobile")).sendKeys("7397648024");
        WebElement sel = driver.findElement(By.id("city"));
		Select na = new Select(sel);
		na.selectByVisibleText("Bangalore");
		
		File f = new File("C:\\Users\\shrey\\OneDrive\\Desktop");
		String absolutepath = f.getAbsolutePath();
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(absolutepath);
	}
}
