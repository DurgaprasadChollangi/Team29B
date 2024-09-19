package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookAHotel {

	//1.Constructor
	public WebDriver driver;
	public Select sc;


	public BookAHotel (WebDriver driver) {

		this.driver=driver;

		PageFactory.initElements(driver, this);	
	}
	//2.identify the web elements

	@FindBy(id="first_name")
	WebElement txtFirstName;

	@FindBy(id="last_name")
	WebElement txtLastName;

	@FindBy(id="address")
	WebElement txtBillingAddress;

	@FindBy(id="cc_num")
	WebElement txtCreditCardNo;

	@FindBy(id="cc_type")
	WebElement drpCreditCardType;

	@FindBy(id="cc_exp_month")
	WebElement drpExpiryMonth;

	@FindBy(id="cc_exp_year")
	WebElement drpExpiryYear;

	@FindBy (id="cc_cvv")
	WebElement txtCVVNumber;
	
	@FindBy(id="book_now")
	WebElement btnBookNow;


	//3.Create the corresponding actions
	public void setFirstName() {
		txtFirstName.sendKeys("Durgaprasad");
	}

	public void setLastName() {
		txtLastName.sendKeys("chollangi");
	}

	public void setBillingAddress() {
		txtBillingAddress.sendKeys("Hyderbad");
	}

	public void setCreditCardNo() {
		txtCreditCardNo.sendKeys("123456789123456");

	}
	public void setCreditCardType() {
		sc=new Select(drpCreditCardType);
		sc.selectByIndex(3);

	}
	public void setExpiryMonth() {
		sc=new Select(drpExpiryMonth);
		sc.selectByIndex(11);
	}
	public void setExpiryYear() {
		sc=new Select(drpExpiryYear);
		sc.selectByIndex(2027);
	}
	public void setCVVNumber() {
		txtCVVNumber.sendKeys("123");

	}
	public void clickBookNow() {
		btnBookNow.click();
	}


}      

