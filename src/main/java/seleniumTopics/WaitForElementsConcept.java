package seleniumTopics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElementsConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");

		By footer = By.xpath("//footer//ul/li/a");

		// An expectation for checking that all elements present on the web page that
		// match the locator are visible.
		// Visibility means that the elements are not only displayed but also have a
		// height and width that is greater than 0.

//		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//		List<WebElement> eleList = wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(footer));
//		System.out.println(eleList.size());
		
		
	}

	
	/**An expectation for checking that all elements 
	 * present on the web page that match the locator are visible.
	 *  Visibility means that the elements are not only displayed 
	 *  but also have a height and width that is greater than 0.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static List<WebElement> waitForElementsVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
			
	}
	
	/**
	 * An expectation for checking that there is at 
	 * least one element present on a web page.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static List<WebElement> waitForElementsPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
			
	}
	

	

}
