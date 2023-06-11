package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		/*
		 * String placeholder =
		 * driver.findElement(By.id("input-firstname")).getAttribute("placeholder");
		 * System.out.println(placeholder);
		 * 
		 * String confpwd =
		 * driver.findElement(By.name("confirm")).getAttribute("placeholder");
		 * System.out.println(confpwd);
		 * 
		 * String loginurl =
		 * driver.findElement(By.linkText("Login")).getAttribute("href");
		 * System.out.println(loginurl);
		 */

		By placeholder = By.id("input-firstname");
		By confpwd = By.name("confirm");
		By loginurl = By.linkText("Login");

		String placeholderValue = doGetAttributeValue(placeholder, "placeholder");
		String confpwdValue = doGetAttributeValue(confpwd, "placeholder");
		String loginurlValue = doGetAttributeValue(loginurl, "href");

		System.out.println(placeholderValue);
		System.out.println(confpwdValue);
		System.out.println(loginurlValue);

		if (placeholderValue.equals("First Name")) {
			System.out.println("right placeholder value--PASS");
		} else {
			System.out.println("wrong placeholder value--FAIL");

		}

		driver.quit();

	}

	public static String doGetAttributeValue(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
