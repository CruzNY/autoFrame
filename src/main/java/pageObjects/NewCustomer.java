package pageObjects;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import steps.ExcelReaderSteps;

public class NewCustomer extends BasePage{
		public @FindBy(xpath = "//input[@name='name']") WebElement customerNameField;
		public @FindBy(xpath = "//input[@value='f']") WebElement genderRadio;
		public @FindBy(xpath = "//input[@id='dob']") WebElement dateOfBirthField;
		public @FindBy(xpath = "//textarea[@name='addr']") WebElement addressField;
		public @FindBy(xpath = "//input[@name='city']") WebElement cityField;
		public @FindBy(xpath = "//input[@name='state']") WebElement stateField;
		public @FindBy(xpath = "//input[@name='pinno']") WebElement pinField;
		public @FindBy(xpath = "//input[@name='telephoneno']") WebElement mobileNumberField;
		public @FindBy(xpath = "//input[@name='emailid']") WebElement emailField;
		public @FindBy(xpath = "//input[@name='password']") WebElement passwordField;
		public @FindBy(xpath = "//input[@value='Submit']") WebElement submitButton;
		public @FindBy(xpath = "//input[@value='Reset']") WebElement resetButton;
		public NewCustomer(){
			super();
			try {
				user_fills_out_form();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		ExcelReaderSteps excelSteps = new ExcelReaderSteps();
		public HashMap<String, String> formInfo = new HashMap<>();
		
		public NewCustomer getLoginPage() {
			getDriver().get("");
			logger.info("Naivgating to: " + driver.getCurrentUrl());
			return new NewCustomer();
		}
		
		public NewCustomer enterName(String name) {
			sendKeysToWebElement(customerNameField, name);
			return new NewCustomer();
		}
		public NewCustomer selectGender() {
			genderRadio.click();
			return new NewCustomer();
		}
		
		public NewCustomer enterDOB(String dob) {
			super.sendKeysToWebElement(dateOfBirthField, dob);
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
		public NewCustomer enterStateFeld (String state) {
			super.sendKeysToWebElement(stateField, state);
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
		public NewCustomer clickButton(String button) {
			if(button.equals("Submit")) 
				submitButton.click();
			else
				resetButton.click();
			return new NewCustomer();
		}
		
		public void user_fills_out_form() throws IOException {
			LinkedHashMap<Integer,List> map = excelSteps.getMapSheet(excelSteps.loadExcelLines(excelSteps.file), "newCustomer");
			for(int i = 0; i<=map.get(0).size()-1; i++) {
				String header = map.get(0).get(i).toString();
				String row = map.get(1).get(i).toString();
				formInfo.put(header, row);
			}
		}
}
