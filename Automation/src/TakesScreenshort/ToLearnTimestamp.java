package TakesScreenshort;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToLearnTimestamp {
	public static void main(String[] args) throws IOException, InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/52");
		
		Thread.sleep(15000);
		
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshort/"+timestamp+".png");
		
		FileHandler.copy(temp, dest);
	}
}
