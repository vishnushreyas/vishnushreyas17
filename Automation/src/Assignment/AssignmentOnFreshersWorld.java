package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnFreshersWorld {

	public static void main(String[] args) throws IOException {
FileInputStream fis = new FileInputStream("./Test-Data/AssignmentData.properties");
		
		//file specific object
		Properties prop = new Properties();
		
		//load
		prop.load(fis);
		
		//get properties
		String url = prop.getProperty("url");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

}
