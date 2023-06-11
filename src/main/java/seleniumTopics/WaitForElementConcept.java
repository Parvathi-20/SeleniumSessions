package seleniumTopics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElementConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		By uname = By.name("username");
		By pwd = By.name("password");
		By forgotPWd = By.linkText("Forgot Password?");
		
		/*//An expectation for checking that an element is present on the DOM of a page.
		//This does not necessarily mean that the element is visible on the page.
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement userName = wait.until(ExpectedConditions.presenceOfElementLocated(uname));
		userName.sendKeys("test@gmail.com");
		
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(3));
		WebElement forgotpassword = wait1.until(ExpectedConditions.presenceOfElementLocated(forgotPWd));
		forgotpassword.click();
		*/
		
//		waitForElementPresence(uname,10).sendKeys("test@gmail.com");
//		waitForElementVisible(forgotPWd,5).click();
		clickElementWhenReady(forgotPWd,5);
	}
	
	
	/**
	 *  * An expectation for checking that an element is present on the DOM of a page. 
	 * This does not necessarily mean that the element is visible.
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public static WebElement waitForElementPresence(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		 return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}
	
	
	/**
	 * 	 * An expectation for checking that an element is present on the DOM of a page and visible on the page. 
	 * Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public static WebElement waitForElementVisible(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		 return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}
	
	
	public static void clickElementWhenReady(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();		

	}

	
	public static WebElement checkElementClickable(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.elementToBeClickable(locator));		

	}

}
