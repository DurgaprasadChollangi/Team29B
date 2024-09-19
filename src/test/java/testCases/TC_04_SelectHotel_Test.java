package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import page_Objects.LoginPage;
import page_Objects.RegistrationPage;
import page_Objects.SearchHotelPage;
import page_Objects.SelectHotel;
import reusuable_Class.BaseClass;

public class TC_04_SelectHotel_Test  extends BaseClass{
	public  RegistrationPage Rp;
	public LoginPage lp;
	public SearchHotelPage sh;
	public SelectHotel seh;
	private WebDriver driver;

	@Test
	public void SelectHotelTest() throws Exception {

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


	}
}
