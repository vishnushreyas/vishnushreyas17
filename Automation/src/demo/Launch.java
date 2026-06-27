package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	System.out.println("HEllO GITHUB");
	driver.manage().window().maximize();
}
}
