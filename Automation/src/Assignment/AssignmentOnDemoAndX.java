package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentOnDemoAndX {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		driver.findElement(By.xpath("//a[text() = 'Twitter']")).click();
		
	    Set<String> window = driver.getWindowHandles();
	    for(String x: window) 
	    {
	    	driver.switchTo().window(x);
	    	String url = driver.getCurrentUrl();
	    	if(url.equals("https://x.com/nopCommerce")) {
	    		driver.findElement(By.xpath("//span[text()='Create account']")).click();
	    		driver.findElement(By.xpath("//input[@autocomplete='name']")).sendKeys("Vishnu Shreyas");
	    		driver.findElement(By.xpath("//input[@autocomplete='email']")).sendKeys("shreyasdhamodharan17@gmail.com");
	    		
	    		WebElement sel = driver.findElement(By.xpath("//select[@id='SELECTOR_1']"));
	    		Select drop = new Select(sel);
	    		drop.selectByVisibleText("October");
	    		
	    		WebElement sel2 = driver.findElement(By.xpath("//select[@id='SELECTOR_2']"));
	    		Select drop1 = new Select(sel2);
	    		drop1.selectByVisibleText("17");
	    		
	    		WebElement sel3 = driver.findElement(By.xpath("//select[@id='SELECTOR_3']"));
	    		Select drop2 = new Select(sel3);
	    		drop2.selectByVisibleText("2003");
	    		
	    		TakesScreenshot ts = (TakesScreenshot)driver;
	    		File temp = ts.getScreenshotAs(OutputType.FILE);
	    		File ss = new File("./screenshort/image2.png");
	    		org.openqa.selenium.io.FileHandler.copy(temp, ss);
	    	}
	    }
	}

}
