package steps.commonSteps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebElement;

import pageObjects.BasePage;

public class SimpleSteps extends BasePage{
	public SimpleSteps() {
		super();
	}
	public void verifyTextDisplayed(String expectedText, String elementName) throws Exception {
		WebElement element = getWebElement(elementName);
		String elementText = element.getText();
		assertEquals(expectedText,elementText);
	}
}
