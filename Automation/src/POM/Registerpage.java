package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerpage {
	@FindBy(id = "gender-male")
	private WebElement male;
	
	@FindBy(id = "FirstName")
	private WebElement first;
	
	@FindBy(id = "LastName")
	private WebElement last;
	
	@FindBy(id = "Email")
	private WebElement email;
	
	@FindBy(id = "Password")
	private WebElement pwd;
	
	@FindBy(id = "ConfirmPassword")
	private WebElement cnpwd;
	
	@FindBy(id="register-button")
    private WebElement registerBtn;
	
	//initialization
	
	public Registerpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
			
		
		
	}

	// calling getter methods
	public WebElement getMale() {
		return male;
	}

	public WebElement getFirst() {
		return first;
	}

	public WebElement getLast() {
		return last;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getCnpwd() {
		return cnpwd;
	}

	public WebElement getRegisterBtn() {
		return registerBtn;
	}
}