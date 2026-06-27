package POM;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./Test-Data/commondata.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String url = prop.getProperty("url");
		String email = prop.getProperty("email");
		String pwd = prop.getProperty("pwd");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(url);
		
		WelcomePage wp = new WelcomePage(driver);
		wp.getLogLink().click();
		
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(email);
		lp.getPwd().sendKeys(pwd);
		lp.getLogInBtn().click();
	}
}
