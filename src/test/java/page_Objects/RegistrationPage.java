package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

	//1.Constructor
	public WebDriver driver;
	public Select sc;


	public RegistrationPage(WebDriver driver) {

		this.driver=driver;

		PageFactory.initElements(driver, this);	
	}

	//2.identify the web elements

	@FindBy(xpath="a[text()='New User Register Here']")
	WebElement RegistrationLink;

	@FindBy(id="username")
	WebElement txtUsername;

	@FindBy(id="password")
	WebElement txtPassword;

	@FindBy(id="re_password")
	WebElement txtConfirmPassword;

	@FindBy(id="full_name")
	WebElement txtFullName;

	@FindBy(id="email_add")
	WebElement txtEmailAddress;


	//@FindBy(id="captcha-form")
	//WebElement txtCaptchaText;

	@FindBy(id="tnc_box")
	WebElement btnTermsConditions;

	@FindBy(id="Submit")
	WebElement btnRegister;


	//3.Create the corresponding actions

	public void setRegistrationLink() {
		RegistrationLink.click();

	}
	public void setUsername()  {
		txtUsername.sendKeys("DurgaprasadChollangi");

	}

	public void SetPassword() {
		txtPassword.sendKeys("N3TF0M");
	}

	public void setConfirmPassword() {
		txtConfirmPassword.sendKeys("N3TF0M");
	}

	public void setFullName() {
		txtFullName.sendKeys("DurgaprasadChollangi");
	}
	public void setEmailAddress() throws Exception {
		txtEmailAddress.sendKeys("durgaprasadchollangi50@gmail.com");

		Thread.sleep(1500);
	}

	public void clickTermsConditions() {
		btnTermsConditions.click();
	}

	public void clickRegister() {
		btnRegister.click();
	}

}

