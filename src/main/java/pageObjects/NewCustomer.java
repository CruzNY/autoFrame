package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCustomer extends BasePage{
		public @FindBy(xpath = "//input[@name='name']") WebElement customerNameField;
//		public @FindBy(xpath = "//input[@id='dob']") WebElement dateOfBirthField;
		public @FindBy(xpath = "//textarea[@name='addr']") WebElement addressField;
		public @FindBy(xpath = "//input[@name='city']") WebElement cityField;
		public @FindBy(xpath = "//input[@name='state']") WebElement stateField;
		public @FindBy(xpath = "//input[@name='pinno']") WebElement pinField;
		public @FindBy(xpath = "//input[@name='telephoneno']") WebElement mobileNumberField;
		public @FindBy(xpath = "//input[@name='emailid']") WebElement emailField;
		public @FindBy(xpath = "//input[@name='password']") WebElement passwordField;

		public NewCustomer(){
			super();
		}
		
		public NewCustomer getLoginPage() {
			getDriver().get("");
			logger.info("Naivgating to: " + driver.getCurrentUrl());
			return new NewCustomer();
		}
		
		
		public NewCustomer enterName(String name) {
			sendKeysToWebElement(customerNameField, name);
			return new NewCustomer();
		}
		public NewCustomer enterDOB(String dob) {
//			super.sendKeysToWebElement(dateOfBirthField, dob);
			return new NewCustomer();
		}
		public NewCustomer enterAddress(String addr) {
			super.sendKeysToWebElement(addressField, addr);
			return new NewCustomer();
		}
		public NewCustomer enterCityFeld (String city) {
			super.sendKeysToWebElement(cityField, city);
			return new NewCustomer();
		}
		public NewCustomer enterPin (String pin) {
			super.sendKeysToWebElement(pinField, pin);
			return new NewCustomer();			
		}
		public NewCustomer enterMobileNumber(String number) {
			super.sendKeysToWebElement(mobileNumberField, number);
			return new NewCustomer();			
		}
		public NewCustomer enterEmail(String email) {
			super.sendKeysToWebElement(emailField, email);
			return new NewCustomer();					
		}
		public NewCustomer enterPassword(String password) {
			super.sendKeysToWebElement(passwordField, password);
			return new NewCustomer();
		}
}
