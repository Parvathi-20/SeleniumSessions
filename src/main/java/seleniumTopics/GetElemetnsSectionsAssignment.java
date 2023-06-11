package seleniumTopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetElemetnsSectionsAssignment {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("acceptInsecureCerts");
		driver = new ChromeDriver(options);
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.get("https://www.odoo.com/");
		driver.manage().window().maximize();
		
		By footer_links = By.xpath("//div[contains(@id,'footer')]//span[contains(@class,'o_footer_title')]/parent::div//li/a");
		clickonfooterlink("Runbot", footer_links);
//		clickonfooterlink("Legal", footer_links);
		
		
		/*
		driver.navigate().refresh();

		By footerlinks = By.xpath("//footer//a");
		By footerlinksCRM = By.xpath("//ul[contains(@class,'iHWrdf')]//a");
		By bankfooter = By.xpath("(//ul[contains(@class,'o_footer_links')])[2]//a");
//		clickonfooterlink("Delivery Information", footerlinks);
		clickonfooterlink("Sitemap", footerlinksCRM);
//		clickonfooterlink("Runbot", bankfooter);
//		sdgffd@ymail.com
		Thread.sleep(5000);
//		if((driver.getTitle()).equals("Delivery Information")) {
//			System.out.println("Clicked on Delivery Information link");
//		}
//		

*/
		
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
