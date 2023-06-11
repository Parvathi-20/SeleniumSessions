package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickElement {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");

		By emailD = By.id("username");
		By pwd = By.id("password");
		By loginBtn = By.id("password-login-button");

		// create web element + perform action
		doSendKeys(emailD, "test@gmail.com");
//		doSendKeys(emailD, null);
		doSendKeys(pwd, "test@123");
		doClick(loginBtn);

		doClear(emailD);
		doSendKeys(emailD, "admin@gmail.com");
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doClear(By locator) {
		getElement(locator).clear();
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

	public static void doSendKeys(By locator, String value) {
//		doClear(locator);
		getElement(locator).sendKeys(value);
	}

}
