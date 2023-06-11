package seleniumTopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		By search = By.name("q");
		By searchSuggestions = By.xpath("//div[@class='wM6W7d']/span");

//		search("selenium", search, "webdriver", searchSuggestions);
		search("asdasdfasdfadfddfdsfdasfsdafdsfsdfasdfadsf", search, "webdriver", searchSuggestions);
	}

	public static void search(String searchKey, By searchLocator, String suggName, By suggestionslocator)
			throws InterruptedException {

		driver.findElement(searchLocator).sendKeys(searchKey);
		Thread.sleep(5000);

		List<WebElement> suggestions = driver.findElements(suggestionslocator);
		int total = suggestions.size();
		System.out.println("total suggestions " + total);

		if (total > 0) {
			for (WebElement e : suggestions) {
				String text = e.getText();
				if (text.length() > 0) {
					System.out.println(text);
					if (text.contains(suggName)) {
						e.click();
						break;
					} else {
						System.out.println(suggName + "is not present ");
					}
				} else {
					System.out.println("blank values -- but no sugeestions");
					break;
				}
			}
		} else {
			System.out.println("No search suggestions found..");
		}

	}

}
