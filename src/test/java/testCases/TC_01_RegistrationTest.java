package testCases;

import org.testng.annotations.Test;

import page_Objects.RegistrationPage;
import reusuable_Class.BaseClass;

public class TC_01_RegistrationTest extends BaseClass {

	public  RegistrationPage Rp;

	@Test
	public void RegistrationTest() throws Exception {

		Rp=new RegistrationPage(driver);
		Rp.setUsername();
		Rp.SetPassword();
		Rp.setConfirmPassword();
		Rp.setFullName();
		Rp.setEmailAddress();
		Rp.clickTermsConditions();
		Rp.clickRegister();
	}
}
