package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysClickConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By username = By.id("input-email");
		By pwd = By.id("input-password");
		By login = By.xpath("//input[@type='submit']");

//		Actions act = new Actions(driver);
//		act.sendKeys(driver.findElement(username), "test@ymail.com").build().perform();
//		act.sendKeys(driver.findElement(pwd), "testtest").build().perform();
//		act.click(driver.findElement(login)).build().perform();

		doActionsSendKeys(username, "test@ymail.com");
		doActionsSendKeys(pwd, "test");
		doActionsClick(login);
		
		
		// Actions Send Keys:
		// move to that element internally
		// click on it -- it will click on middle of the element
		// enter the value

		// WebElement sendKeys:
		// enter the value

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doActionsSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).build().perform();
		
	}

	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).build().perform();
	}

}
