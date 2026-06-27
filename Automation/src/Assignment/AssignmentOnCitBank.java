package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentOnCitBank {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		
        WebElement ele = driver.findElement(By.xpath("//button[@id='CIT-chart-submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollInputView(False)", ele);
		
		
		
		WebElement deposit = driver.findElement(By.xpath("//input[@formcontrolname='cdAmount']"));
		deposit.clear();
		
		driver.findElement(By.xpath("//input[@formcontrolname='cdLength']"));
		driver.findElement(By.xpath("//input[@formcontrolname='cdRate']"));
		
		WebElement drp = driver.findElement(By.xpath("//mat-select[@formcontrolname='cdCompounding']"));
		
		Select re = new Select(drp);
		
		List<WebElement> op = re.getOptions();
		for(WebElement we:op) {
			System.out.println(we.getText());
		}
		re.selectByVisibleText(" Compounded Quarterly ");
	}

}
