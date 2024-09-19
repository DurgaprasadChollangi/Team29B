package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import page_Objects.BookAHotel;
import page_Objects.BookedItinerary;
import page_Objects.LoginPage;
import page_Objects.RegistrationPage;
import page_Objects.SearchHotelPage;
import page_Objects.SelectHotel;
import reusuable_Class.BaseClass;

public class TC_06_BookedItinerary_Test  extends BaseClass{

	public  RegistrationPage Rp;
	public LoginPage lp;
	public SearchHotelPage sh;
	public SelectHotel seh;
	public BookAHotel Bh;
	public  BookedItinerary Bi;


	private WebDriver driver;

	@Test
	public void BookedItineraryTest() throws Exception {

		//Registration
		Rp=new RegistrationPage(driver);
		Rp.setUsername();
		Rp.SetPassword();
		Rp.setConfirmPassword();
		Rp.setFullName();
		Rp.setEmailAddress();
		Rp.clickTermsConditions();
		Rp.clickRegister();

		//Login
		lp=new LoginPage(driver);
		lp.setUsername();
		lp.setPassword();
		lp.clickLoginButton();

		//Search Hotel
		sh=new SearchHotelPage(driver);
		sh.setLocation();
		sh.setRoomNo();
		sh.setDatePickIn();
		sh.setDatePickOut();
		sh.clickSearchButton();

		// SelectHotel
		seh.clickSelect();
		seh.clickContinue();

		//Book A hotel
		Bh.setFirstName();
		Bh.setLastName();
		Bh.setBillingAddress();
		Bh.setCreditCardNo();
		Bh.setCreditCardType();
		Bh.setExpiryMonth();
		Bh.setExpiryYear();
		Bh.setCVVNumber();
		Bh.clickBookNow();

		//BookedItinerary

		Bi.clickBookedItinerary();
		Bi.clickCheckbox();


	}
}


