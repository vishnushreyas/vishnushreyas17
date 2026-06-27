package TestNG;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToClickOnBooks extends Baseclass {
	@Test
	public void clickOnBooks() {
		driver.findElement(By.partialLinkText("Books")).click();
		Reporter.log("Book Page is Displayed",true);
	}
}
