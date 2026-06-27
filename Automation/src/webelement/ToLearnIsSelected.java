package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsSelected {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement value = driver.findElement(By.xpath("//label[text()='Excellent']/..//input[@type='radio']"));
		boolean status = value.isSelected();
		System.out.println(status);
		value.click();
		boolean status1 = value.isSelected();
		System.out.println(status1);
	}
}
