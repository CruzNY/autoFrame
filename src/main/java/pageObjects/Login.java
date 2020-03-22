package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import stepDefinitions.commonSteps.CommonSimple;

public class Login extends BasePage{
	public @FindBy(xpath = "//input[@name='uid']") WebElement emailFeild;
	public @FindBy(xpath = "//input[@name='password']") WebElement passwordFeild;
	public @FindBy(xpath = "//input[@name='btnLogin']") WebElement loginButton;
	public @FindBy(xpath= "//tr[@class='heading3']/td[text()='Manger Id : mngr249521']") WebElement homempageVerification;
	public @FindBy(xpath= "//a[text()='New Customer']") WebElement newCustomer;
	CommonSimple commonSteps = new CommonSimple();
	public Login() {
		super();
	}
	public Login enterEmail(String email) {
		sendKeysToWebElement(emailFeild, email);
		logger.info("Username: " + email);
		return new Login();
	}
	public Login enterPassword(String password) {
		logger.info("Password: "+ password);
		sendKeysToWebElement(passwordFeild, password);
		return new Login();		
	}
	public Login clickLoginButton() {
		loginButton.click();
	return new Login();
	}
	
	public Login verifyLoginPage() {
		login.verifyLoginPage();
		return new Login();
	}
}
