package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.DriverFactory;
import utils.PropertyReader;

public class BasePage extends DriverFactory {
	protected WebDriverWait wait;
	protected JavascriptExecutor jsExecutor;
	public PropertyReader prop;

	public BasePage() {
		this.wait = new WebDriverWait(driver, 15);
		jsExecutor = ((JavascriptExecutor) driver);
		prop = new PropertyReader();
	}

	// Click Methods
	public void waitAndClickElement(WebElement element) throws InterruptedException {
		boolean clicked = false;
		int attempts = 0;
		while (!clicked && attempts < 4) {
			try {
				this.wait.until(ExpectedConditions.elementToBeClickable(element)).click();
//				System.out.println("Successfully clicked " + "<" + element.toString() + ">");
				logger.info("Successfully clicked " + "<" + element.toString() + ">");
				clicked = true;
			} catch (Exception e) {
//				System.out.println("Unsuccessfully clicked. Exception: " +e.getMessage());
				logger.info("Unsuccessfully clicked. Exception: " + e.getMessage());
				Assert.fail(
						"Unable to wait and click on the WebElement, using locator: " + "<" + element.toString() + ">");
			}
			attempts++;
		}
	}
	public void  clickWebElement(String elementName) throws Exception {
		WebElement element = getWebElement(elementName);
		element.click();
	}

//	 Send Keys Methods
	public void sendKeysToWebElement(WebElement element, String text) {
		try {
			this.WaitUntilWebElementIsVisible(element);
			element.clear();
			element.sendKeys(text);
			System.out.println(text + " Successfully entered");
		} catch (Exception e) {
			System.out.println("Unable to locate WebElement: " + "<" + element.toString()
					+ "> and send the following keys: " + text);
			Assert.fail("Unable to send keys to WebElement, Exception: " + e.getMessage());
		}
	}

	public void sendKeysToWebElement(String text, String elementName) throws Exception {
		WebElement element = getWebElement(elementName);
		element.sendKeys(text);
	}

	// Waiting Methods
	public boolean WaitUntilWebElementIsVisible(WebElement element) {
		try {
			this.wait.until(ExpectedConditions.visibilityOf(element));
			System.out.println(element.toString());
			return true;
		} catch (Exception e) {
			System.out.println("WebElement is NOT visible, using locator: " + "<" + element.toString() + ">");
			Assert.fail("WebElement is NOT visible, Exception: " + e.getMessage());
			return false;
		}
	}

	// Page Methods
	public void waitTillPageIsCompletelyLoaded() {
		this.wait.until(
				driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete"));
	}
	
	public WebElement getWebElement(String elementName) throws Exception {
		String[] locator = prop.getLocator(elementName);
		String locatorType = locator[0];
		String locatorValue = locator[1];
		WebElement element = null;
		boolean retry = true;
		int count = 0;

		while (retry && count < 4) {
			try {
				switch (locatorType) {
				case "xpath":
					element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorValue)));
					break;
				case "id":
					element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locatorValue)));
					break;
				}
				retry = false;
			} catch (StaleElementReferenceException e) {
				e.printStackTrace();
				wait();
				count++;
			}
		}
		return element;
	}

}
