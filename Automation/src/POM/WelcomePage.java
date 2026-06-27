package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	//Declaration
	@FindBy(linkText = "Register")
	private WebElement regLink;
	
	@FindBy(linkText = "Log in")
	private WebElement logLink;
	
	@FindBy(id="small-searchterms")
	private WebElement srchBox;
	
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement srchBtn;
	
	//initialization
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	//calling getter methods
	public WebElement getRegLink() {
		return regLink;
	}

	public WebElement getLogLink() {
		return logLink;
	}

	public WebElement getSrchBox() {
		return srchBox;
	}

	public WebElement getSrchBtn() {
		return srchBtn;
	}
	
}
