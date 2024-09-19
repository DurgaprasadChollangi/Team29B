package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	
	//1.Constructor
		public WebDriver driver;
		


		public SelectHotel  (WebDriver driver) {

			this.driver=driver;

			PageFactory.initElements(driver, this);	
		
			//2.identify the web elements
}	
			@FindBy(id="radiobutton_1")
			WebElement btnSelect;

            @FindBy(id="continue")
            WebElement btnContinue;

          //3.Create the corresponding actions

          public void clickSelect() {
        	  btnSelect.click();
          }
          
          public void clickContinue() {
        	  btnContinue.click();
          }
}


