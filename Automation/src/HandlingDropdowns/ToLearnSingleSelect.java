package HandlingDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSingleSelect 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		
		WebElement sel = driver.findElement(By.id("select3"));
		Select na = new Select(sel);
		List<WebElement> op = na.getOptions();
		for(WebElement el : op) 
		{
			System.out.println(el.getText());
		}
		System.out.println("---------------------");
		
		na.selectByIndex(2);
		na.selectByValue("Poland");
		na.selectByVisibleText("United Kingdom");
		
		boolean mul = na.isMultiple();
		System.out.println(mul);

	}
}