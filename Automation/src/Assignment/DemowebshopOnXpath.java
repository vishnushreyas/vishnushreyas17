package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemowebshopOnXpath {
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://demowebshop.tricentis.com/");
driver.manage().window().maximize();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Computers");
driver.findElement(By.xpath("//input[@type='submit']")).click();

driver.navigate().to("https://demoapps.qspiders.com/");

driver.findElement(By.xpath("(//div[text()='Explore more'])[1]")).click();

driver.findElement(By.xpath("//section[text()='X Path']")).click();

driver.findElement(By.xpath("//section[text()='Login 1.0']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@placeholder='Username:']")).sendKeys("Sudharshan");
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("#Su07dharshan");
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@type='checkbox']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@type='radio']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//section[text()='Login 2.0']")).click();
driver.findElement(By.xpath("//input[@placeholder='Username:']")).sendKeys("Sudharshan");
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("#Su07dharshan");
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@type='checkbox']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@type='radio']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//section[text()='Login 3.0']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Sudharshan");
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("#Su07dharshan");
Thread.sleep(5000);
driver.findElement(By.xpath("//button[text()='Login']")).click();
}
}