package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		//create a webelement + perform action (click, sendKeys, getText, isDisplayed ...)
		//findElement()       + click(), sendKeys();
		
		
//		1st
//		driver.findElement(By.id("input-email")).sendKeys("test.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");
		
//		2nd:
//		
//		WebElement email = driver.findElement(By.id("input-email"));
//		WebElement pwd = driver.findElement(By.id("input-password"));
//		
//		email.sendKeys("test.com");
//		pwd.sendKeys("test@123");
		
		
//		3rd:
		
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		WebElement email = driver.findElement(emailId);
//		WebElement pwd = driver.findElement(password);
//		
//		email.sendKeys("test.com");
//		pwd.sendKeys("test@123");
//		

//		4th
//		
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		WebElement email = getElement(emailId);
//		WebElement pwd = getElement(password);
//		
//		email.sendKeys("test.com");
//		pwd.sendKeys("test@123");
		

		
		//5th: By locator and create generic functions for webelement and action
//		
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		doSendkeys(emailId,"ababab@test.com");
//		doSendkeys(password, "ab@123");
//		
		
		//6th: By locator and create generic functions for webelement and action in util class
		By emailId = By.id("input-email");
		By password = By.id("input-password");
	
		ElementUtil u = new ElementUtil(driver);
		u.doSendkeys(emailId, "herbalife@test.com");
		u.doSendkeys(password, "aabb@123");
		
			
	}
	
	
	public static void doSendkeys(By locator, String value) {
		doClear(locator);
		getElement(locator).sendKeys(value);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doClear(By locator) {
		getElement(locator).clear();
	}
	
}
