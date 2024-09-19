package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookedItinerary {

	//1.Constructor
	public WebDriver driver;
	public Select sc;


	public BookedItinerary (WebDriver driver) {

		this.driver=driver;

		PageFactory.initElements(driver, this);	
	}
	//2.identify the web elements

	@FindBy(id="my_itinerary")
	WebElement btnBookedItinerary;

	@FindBy(xpath="//td/input[@value='1254404']")
	WebElement btnCheckbox;

	//3.Create the corresponding actions
	
	public void clickBookedItinerary() {
	 btnBookedItinerary.click();
	}
	public void clickCheckbox() {
		btnCheckbox.click();
	}
}
