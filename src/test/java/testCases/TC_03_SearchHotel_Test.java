package testCases;

import org.testng.annotations.Test;

import page_Objects.LoginPage;
import page_Objects.RegistrationPage;
import page_Objects.SearchHotelPage;
import reusuable_Class.BaseClass;

public class TC_03_SearchHotel_Test  extends BaseClass{
	public  RegistrationPage Rp;
	public LoginPage lp;
	public SearchHotelPage sh;

	@Test
	public void SearchHotelTest() throws Exception {


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


	}


}
