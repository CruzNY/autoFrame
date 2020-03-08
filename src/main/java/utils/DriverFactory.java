package utils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverFactory {
	public static WebDriver driver;

	public WebDriver getDriver() {
		try {
			ReadConfigFile file = new ReadConfigFile();
			String browserName = file.getBrowser();

			switch (browserName) {
			case "chrome":
				if (null == driver) {
					System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
					driver = new ChromeDriver();
					driver.manage().window().maximize();
				}
				break;
			case "firefox":
				if (null == driver) {
					System.setProperty("webdriver.gecko.driver", Constant.FIREFOX_DRIVER_DIRECTORY);
					DesiredCapabilities capabilities = new DesiredCapabilities();
					capabilities.setCapability("marionette", true);
					driver = new FirefoxDriver();
				}
				break;
			}
		} catch (Exception e) {
			System.out.println("Unable to load browser"+ e.getMessage());
		} finally {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		}
		return driver;
	}
}
