package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// login page divided  into 3 parts 
	//1.constructor
	//2.identify the web Element
	//3.create the  actions 

	//1.constructor--> same name like class name

	public static  WebDriver  driver; // remote WebDriver
	public LoginPage(WebDriver driver) {   // Local WebDriver
		this.driver=driver;  // amiguity issues

		PageFactory.initElements(driver, null);
	}

	//2.identify the web Element

	@FindBy(id="username")
	WebElement txtUsername;

	@FindBy(id="password")
	WebElement txtPassword;

	@FindBy(id="login")
	WebElement btnLogin;

	//3.create the  actions 

	public void setUsername()  {
		txtUsername.sendKeys("DurgaprasadChollangi");
	}
	public void setPassword() {
		txtPassword.sendKeys("N3TF0M");
	}

	public void clickLoginButton() {

		btnLogin.click();
	}
}