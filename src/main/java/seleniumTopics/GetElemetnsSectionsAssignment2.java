package seleniumTopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetElemetnsSectionsAssignment2 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("acceptInsecureCerts");
		driver = new ChromeDriver(options);
		driver.get("https://www.freshworks.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		By footer_links = By.xpath("//footer//a");
		clickonfooterlink("Sitemap", footer_links);
		
		System.out.println("Actual title is " + driver.getTitle());
		driver.quit();
	}

	public static List<WebElement> getalllinks(By locator) {
		return driver.findElements(locator);
	}

	public static void clickonfooterlink(String linktoclick, By locator) {

		List<WebElement> getfooterlinks = getalllinks(locator);
		System.out.println("Total links under footer " + getfooterlinks.size());
		for (WebElement e : getfooterlinks) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(linktoclick)) {
				e.click();
				break;
			}
		}

	}

}
