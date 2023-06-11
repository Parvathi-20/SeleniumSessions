package seleniumTopics;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
		contextClickonElement(ele);
		
		List<WebElement> rightoptions = driver.findElements(By.cssSelector("ul.context-menu-list span"));
		for (WebElement e : rightoptions) {
			String text = e.getText();
			e.click();
			switchToAlertAccept(ele);
			contextClickonElement(ele);
//			if(text.equals("Copy")) {
//				e.click();
//				switchToAlertAccept();
//				break;
//			}
		}
	}

	public static void switchToAlertAccept(WebElement ele) {
		
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.accept();

	}

	public static void contextClickonElement(WebElement ele) {
		Actions action = new Actions(driver);
		action.contextClick(ele).build().perform();
	}

}
