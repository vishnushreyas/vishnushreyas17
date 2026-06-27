package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment9 {
	public static void main(String[] args) throws InterruptedException {  
	  
	WebDriver driver = new ChromeDriver();  
	driver.manage().window().maximize();  
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  
	  
	driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");  
	  
	WebElement ele = driver.findElement(By.id("country_code"));  
	Select sel = new Select(ele);  
	sel.selectByIndex(0);  
	  
	WebElement ele1 = driver.findElement(By.id("select3"));  
	Select sel1 = new Select(ele1);  
	sel1.selectByValue("India");  
	  
	WebElement ele2 = driver.findElement(By.id("select5"));  
	Select sel2 = new Select(ele2);  
	sel2.selectByVisibleText("Karnataka");  
	  
	WebElement ele3 = driver.findElement(By.xpath("(//select[contains(@class,'placeholder-blueGray')])[4]"));  
	Select sel3 = new Select(ele3);  
	sel3.selectByValue("Belgaum");  
	  
	WebElement ele4 = driver.findElement(By.id("select7"));  
	Select sel4 = new Select(ele4);  
	sel4.selectByIndex(1);  
	  
	  
	//multiselect   
	driver.findElement(By.xpath("//a[text()='Multi Select']")).click();  
	  
	WebElement ele5 = driver.findElement(By.id("select-multiple-native"));  
	Select sel5 = new Select(ele5);  
	sel5.selectByVisibleText("Mens Casual Premium ...");  
	  
	//disabled    
	driver.findElement(By.xpath("//a[text()='Disabled']")).click();  
	  
	WebElement ele6 = driver.findElement(By.xpath("//select[@id='SelectCountry']"));  
	JavascriptExecutor js = (JavascriptExecutor)driver;  
	js.executeScript("arguments[0].removeAttribute('disabled')", ele6);  
	Select sel6 = new Select(ele6);  
	sel6.selectByValue("India");  

	WebElement ele7 = driver.findElement(By.xpath("//select[@id='slectState']"));  
	JavascriptExecutor js1 = (JavascriptExecutor)driver;  
	js1.executeScript("arguments[0].removeAttribute('disabled')", ele7);  
	Select sel7 = new Select(ele7);  
	sel7.selectByIndex(1);  
	  
	WebElement ele8 = driver.findElement(By.xpath("//select[@id='citySelect']"));  
	JavascriptExecutor js2 = (JavascriptExecutor)driver;  
	js2.executeScript("arguments[0].removeAttribute('disabled')", ele8);  
	Select sel8 = new Select(ele8);  
	sel8.selectByVisibleText("Mumbai");  
	  
	WebElement ele9 = driver.findElement(By.xpath("//select[@id='select_quantity']"));  
	JavascriptExecutor js3 = (JavascriptExecutor)driver;  
	js3.executeScript("arguments[0].removeAttribute('disabled')", ele9);  
	Select sel9 = new Select(ele9);  
	sel9.selectByValue("2");  
	  	  
    }

}