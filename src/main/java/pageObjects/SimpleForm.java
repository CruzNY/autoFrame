package pageObjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SimpleForm extends BasePage{
	public @FindBy(xpath = "//input[@id='user-message']") WebElement messageTextBox;
	public @FindBy(xpath = "//button[text()='Show Message']") WebElement showMessageButton;
	public @FindBy(xpath = "//div[@id='user-message']/label/following-sibling::span") WebElement displayedMessage;
	public SimpleForm() {
		super();
	}
	public SimpleForm enterMessage(String message) {
		super.sendKeysToWebElement(messageTextBox, message);
		return new SimpleForm();
	}
	public SimpleForm clickButton() {
		showMessageButton.click();
		return new SimpleForm();
	}
	public SimpleForm verifyMessage(String expected) {
		String actual= displayedMessage.getText().toString();
		assertEquals(actual, expected);
		return new SimpleForm();
	}
	
}
