package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMultiLevelMenuHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");

		By parentMenuOtpion = By.xpath("//a[@qa='categoryDD']");

		multiLevelMenuChildMenuHandle(parentMenuOtpion,"Beauty & Hygiene","Hair Care","Hair Color");
//		multiLevelChildMenuHandle(parentMenuOtpion, "Beauty & Hygiene", "Hair Care", "Dry Shampoo & Conditioner");
		Thread.sleep(1000);
		String textCount = driver.findElement(By.xpath("//input[@id='snowplow_screen_view_totalcount']"))
				.getAttribute("value");

		System.out.println(textCount);
	}

	public static WebElement getElement(String text) {
		return driver.findElement(By.linkText(text));
	}

	public static void moveToElementAction(WebElement ele) throws InterruptedException {

		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		Thread.sleep(1000);
	}

	public static void multiLevelMenuChildMenuHandle(By parentMenuLocator, String level1LinkText, String level2LinkText,
			String level3LinkText) throws InterruptedException {

		driver.findElement(parentMenuLocator).click();
		Thread.sleep(1000);
		WebElement level1 = getElement(level1LinkText);
		moveToElementAction(level1);

		WebElement level2 = getElement(level2LinkText);
		moveToElementAction(level2);

		WebElement level3 = getElement(level3LinkText);
		level3.click();
	}

	public static void multiLevelChildMenuHandle(By parentMenuLocator, String level2LinkText, String level3LinkText,
			String level4LinkText) throws InterruptedException {

		WebElement level1 = driver.findElement(parentMenuLocator);

		Actions act = new Actions(driver);

		act.moveToElement(level1).build().perform();
		Thread.sleep(1000);

		WebElement level2 = driver.findElement(By.linkText(level2LinkText));
		act.moveToElement(level2).build().perform();
		Thread.sleep(1000);

		WebElement level3 = driver.findElement(By.linkText(level3LinkText));
		act.moveToElement(level3).build().perform();
		Thread.sleep(1000);

		driver.findElement(By.linkText(level4LinkText)).click();
	}
}
