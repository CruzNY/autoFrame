package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCustomer extends BasePage{
		public @FindBy(xpath = "") WebElement customerNameField;
		public @FindBy(xpath = "") WebElement genderField;
		public @FindBy(xpath = "") WebElement dateOfBirthField;
		public @FindBy(xpath = "") WebElement addressField;
		public @FindBy(xpath = "") WebElement cityField;
		public @FindBy(xpath = "") WebElement stateField;
		public @FindBy(xpath = "") WebElement pinField;
		public @FindBy(xpath = "") WebElement mobileNumberField;
		public @FindBy(xpath = "") WebElement emailField;
		public @FindBy(xpath = "") WebElement asswordField;
		public @FindBy(xpath = "") WebElement submitButton;
		NewCustomer(){
			super();
		}
		public NewCustomer enterName(String name) {
			sendKeysToWebElement(customerNameField, name);
			return new NewCustomer();
		}
		public NewCustomer enterGender(String gender) {
			genderField.click();
			return new NewCustomer();
		}
		
}
