package seleniumTopics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleURL {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.reddit.com/");
		


		By businesslink = By.xpath("//a[text()='Business, Economics, and Finance']");
		By gameStoplink = By.xpath("//span[(text()='GameStop')]");

		ElementUtil eu = new ElementUtil(driver);
		eu.clickElementWhenReady(businesslink, 30);
//		eu.checkElementClickable(businesslink, 10).click();
		eu.checkElementClickable(gameStoplink, 20).click();
//		waitForTitleIsAndCapture("GameStop", 10);
//		waitForFullTitleAndCapture("Best GameStop Posts - Reddit",10);
		waitForURLContainsAndCapture("gamestop", 5);
//		driver.close();
		
	}

	public static String waitForURLContainsAndCapture(String urlFraction, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(timeOut));
		if (wait.until(ExpectedConditions.urlContains(urlFraction))) {
			String url = driver.getCurrentUrl();
			return url;
		} else {
			System.out.println("url is not present within the given timeout : " + timeOut);
			return null;
		}
	}

	public static String waitForURLAndCapture(String urlValue, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if (wait.until(ExpectedConditions.urlToBe(urlValue))) {
			String url = driver.getCurrentUrl();
			return url;
		} else {
			System.out.println("url is not present within the given timeout : " + timeOut);
			return null;
		}
	}
	
	public static String waitForTitleIsAndCapture(String titlefraction, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		if (wait.until(ExpectedConditions.titleContains(titlefraction))) {
			String title = driver.getTitle();
			System.out.println(title);
			return title;
		} else {
			System.out.println("title is not loaded within the given timeout " + timeout);
			return null;
		}
	}

	public static String waitForFullTitleAndCapture(String titleval, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		if (wait.until(ExpectedConditions.titleIs(titleval))) {
			String title = driver.getTitle();
			System.out.println(title);
			return title;
		} else {
			System.out.println("title is not loaded within the given timeout " + timeout);
			return null;

		}
	}

}
