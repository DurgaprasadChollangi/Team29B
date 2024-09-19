package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Logout {

	//1.Constructor
	public WebDriver driver;
	public Select sc;


	public Logout (WebDriver driver) {

		this.driver=driver;

		PageFactory.initElements(driver, this);	
	}
	//2.identify the web elements

	@FindBy(id="logout")
	WebElement btnLogout;


	//3.create the  actions 
	public void clickLogout() {
		btnLogout.click();
	}

}

