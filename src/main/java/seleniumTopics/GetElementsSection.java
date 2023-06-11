package seleniumTopics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementsSection {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();

		By linklocator = By.className("list-group-item");
	
//		List<WebElement> rightlinks = getLinkElements(linklocator);
////		System.out.println(rightlinks.size());
//
//		for (WebElement e : rightlinks) {
//			String text = e.getText();
//			if (text.equals("Forgotten Password")) {
//				e.click();
//				Thread.sleep(2000);
//				break;
//			}
//		}
		
		clickElementFromPageSection(linklocator,"Forgotten Password");
		
		/*
		 * if (rightlinks.size() == 13) {
		 * System.out.println("no of links are matching"); }
		 * 
		 * List<String> PageLinks = getLinkText(linklocator);
		 * if(PageLinks.contains("Register")) { System.out.println("Register - pass"); }
		 */
//		driver.quit();
	}

	public static List<WebElement> getLinkElements(By locator) {
		return driver.findElements(locator);
	}

	public static List<String> getLinkText(By locator) {
		List<WebElement> Pagerightlinks = getLinkElements(locator);
		List<String> LinkTestList = new ArrayList<String>();

		for (WebElement e : Pagerightlinks) {
			String eleLinkText = e.getText();
			LinkTestList.add(eleLinkText);

		}

		return LinkTestList;
	}

	
	
	//specific section link to click
	public static void clickElementFromPageSection(By locator, String expectedtxt) {

		List<WebElement> eleList = getLinkElements(locator);
		for (WebElement e : eleList) {
			String text = e.getText();
			if (expectedtxt.equals(text)) {
				e.click();
				break;
			}
		}

	}

}
