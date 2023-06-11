package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelection {

	static WebDriver driver;

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("acceptInsecureCerts");
		driver = new ChromeDriver(options);
		driver.get("https://ainurpos.com/partnership/");

		By countryPhCode = By.id("form-field-field_7edda11");
		By country = By.id("form-field-country");

		doSelectDropDownbyIndex(country, 5);
		doSelectDropDownbyVisibleText(country, "Australia");
		doSelectDropDownbyValueAttribute(countryPhCode, "Australia	61");

	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);
	}

	public static void doSelectDropDownbyIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public static void doSelectDropDownbyValueAttribute(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

	public static void doSelectDropDownbyVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}

}
