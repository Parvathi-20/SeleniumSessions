package seleniumTopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SpicejetMultiMenu {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(1000);
		
		WebElement element = driver.findElement(By.xpath("//div[text()='Add-ons']"));
	
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
		
		List<WebElement> addons = driver.findElements(By.xpath("//div[contains(@class,'r-cn9azx')]/div"));
		for (WebElement e: addons) {
			String text = e.getText();
			System.out.println(text);
			
		}
		
	
	}

}
