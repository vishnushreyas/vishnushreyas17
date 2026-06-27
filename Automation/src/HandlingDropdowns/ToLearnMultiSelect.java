package HandlingDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnMultiSelect {
	
		public static void main(String[] args) 
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("file:///C:/Users/shrey/OneDrive/Desktop/multiDropdown.html");
			
			 WebElement sel = driver.findElement(By.id("Countries"));
			 Select na = new Select(sel);
			
			List<WebElement> op = na.getOptions();
			for(WebElement el : op) 
			{
				System.out.println(el.getText());
			}
			System.out.println("---------------------");
			
			na.selectByIndex(4);
			na.selectByValue("3");
			na.selectByVisibleText("India");
			
			boolean mul = na.isMultiple();
			System.out.println(mul);
			
			driver.close();

		}
		
}

