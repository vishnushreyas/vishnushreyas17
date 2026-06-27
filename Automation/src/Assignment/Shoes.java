package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import TestNG.Baseclass;

public class Shoes extends Baseclass{
@Test
public void shoes() {
driver.findElement(By.partialLinkText("Apparel & Shoes")).click();                  
WebElement size = driver.findElement(By.id("products-pagesize"));
Select sel=new Select(size);
sel.selectByVisibleText("12");
Reporter.log("Successfully displayed shoes and Apparel");
}

}

