package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
//		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
//
//		By parentMenu = By.className("menulink");
//		By childmenu = By.linkText("COURSES");
////		handleTwoLevelmenu(parentMenu, childmenu);
//		handleTwoLevelmenu(parentMenu, "COURSES");
		
		driver.get("https://spiceclub.spicejet.com/signup");
		Thread.sleep(4000);
		By parentMenu = By.linkText("About SpiceClub");	
		handleTwoLevelmenu(parentMenu, "Tiers");
		
	}

	public static void handleTwoLevelmenu(By parentmenu, By childMenu) throws InterruptedException {
		WebElement contacts = driver.findElement(parentmenu);

		Actions act = new Actions(driver);
		act.moveToElement(contacts).build().perform();
		Thread.sleep(2000);
		driver.findElement(childMenu).click();
	}

	public static void handleTwoLevelmenu(By parentmenu, String childMenuText) throws InterruptedException {
		WebElement contacts = driver.findElement(parentmenu);

		Actions act = new Actions(driver);
		act.moveToElement(contacts).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText(childMenuText)).click();
	}
}
