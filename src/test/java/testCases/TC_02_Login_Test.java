package testCases;

import org.testng.annotations.Test;

import page_Objects.LoginPage;
import page_Objects.RegistrationPage;
import reusuable_Class.BaseClass;

public class TC_02_Login_Test extends BaseClass {
	
	public  RegistrationPage Rp;
	public  LoginPage lp;
	
	@Test
	public void loginTest() throws Exception {
		
		
		//Registration
		Rp=new RegistrationPage(driver);
		Rp.setUsername();
		Rp.SetPassword();
		Rp.setConfirmPassword();
		Rp.setFullName();
		Rp.setEmailAddress();
		Rp.clickTermsConditions();
		Rp.clickRegister();
		
		lp=new LoginPage(driver);
		
	    lp.setUsername();
	    lp.setPassword();
	    lp.clickLoginButton();	
	}


}
