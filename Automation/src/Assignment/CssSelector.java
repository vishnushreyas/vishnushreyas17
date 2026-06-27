package Assignment;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

		public static void main(String[] args) throws InterruptedException {

			WebDriver driver=new ChromeDriver();

			driver.get("https://demoapps.qspiders.com/ui?scenario=1");

			driver.manage().window().maximize();

			Thread.sleep(10000);

			driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Vishnu Shreyas D");

			Thread.sleep(2000);

			driver.findElement(By.cssSelector("input[type='email']")).sendKeys("shreyasdhamodharan17@gmail.com");

			Thread.sleep(2000);

			driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Vishnu@1017");

			Thread.sleep(2000);

			driver.findElement(By.cssSelector("button[type='submit']")).click();



		}



}
