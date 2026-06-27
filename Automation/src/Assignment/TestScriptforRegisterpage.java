package Assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import POM.Registerpage;
import POM.WelcomePage;

public class TestScriptforRegisterpage {
	public static void main(String[] args) throws IOException {
	

			FileInputStream yn= new FileInputStream("./Test-Data/commondata.properties");
			Properties prop= new Properties();
			prop.load(yn);
			
			
			String url = prop.getProperty("url");
			prop.getProperty("Gender");
			String first = prop.getProperty("Firstname");
			String last = prop.getProperty("Lastname");
			String email = prop.getProperty("email");
			String pwd = prop.getProperty("pwd");
			String cnpwd = prop.getProperty("cnpwd");
			
			//Test script
			
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			String pic = LocalDateTime.now().toString().replace(":", "-");
			
			driver.get(url);
			
			WelcomePage wp = new WelcomePage(driver);
			wp.getRegLink().click();
			
			Registerpage rp=new Registerpage(driver);
			rp.getMale().click();
			rp.getFirst().sendKeys(first);
			rp.getLast().sendKeys(last);
			rp.getEmail().sendKeys(email);
			rp.getPwd().sendKeys(pwd);
			rp.getCnpwd().sendKeys(cnpwd);
			rp.getRegisterBtn().click();
			
			//take screenshot
			
			TakesScreenshot ts = (TakesScreenshot) driver;
	        File src = ts.getScreenshotAs(OutputType.FILE);
	        File dest = new File("./screenshot/pic.png");
	        FileHandler.copy(src, dest);
				
	}
}