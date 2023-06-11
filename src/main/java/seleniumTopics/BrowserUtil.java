package seleniumTopics;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


/**
 * 
 * @author lenovo
 *
 */
public class BrowserUtil {

	WebDriver driver;

	/*
	 * This method is intialisng the driver on the basis of given browser Possible
	 * browsers are chrome,firefox,safari,edge
	 * 
	 * @param browserName
	 */
	public WebDriver initDriver(String browserName) {

		System.out.println("launching the browser " + browserName);

		if (browserName == null) {
			System.out.println("Browser Name can not be null");
			throw new MySeleniumException("Browser Null Exception");
		}

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
//			ChromeOptions options = new ChromeOptions();
//			options.addArguments("--remote-allow-origins=*");
//			options.addArguments("--no-sandbox");
//			options.addArguments("--disable-dev-shm-usage");
//			driver = new ChromeDriver(options);
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();

			break;
		case "safari":
			driver = new SafariDriver();

			break;
		case "edge":
			driver = new EdgeDriver();

			break;
		default:
			System.out.println("Pls pass the right browser " + browserName);
			throw new MySeleniumException("Invalid browser name exception");
		}
		
		return driver;

	}

	/*
	 * This method is used to launch application URL
	 * @param url
	 */
	public void launchURL(String url) {
		if (url == null) {
			System.out.println("URL can not be null");
			throw new MySeleniumException("URL Null Exception");
		}
		if (url.contains("http")) {
			driver.get(url);
		} else {
			System.out.println("http(s) is missing");
		}

	}

	/*
	 * This method is used to launch application URL
	 * @param url
	 */
	public void launchURL(URL url) {
		if (url == null) {
			System.out.println("URL can not be null");
			throw new MySeleniumException("URL Null Exception");
		}
		
		String mainURL = String.valueOf(url);
		if (mainURL.contains("http")) {
			driver.navigate().to(mainURL);
		} else {
			System.out.println("http(s) is missing");
		}

	}
	
	public String getPagetitle() {
		String PageTitle = driver.getTitle();
		return PageTitle;
	}

	public String getPageURL() {
		String PageURL = driver.getCurrentUrl();
		return PageURL;
	}

	public void quitBrowser() {
		driver.quit();
	}

	public void closeBrowser() {
		driver.close();
	}
}
