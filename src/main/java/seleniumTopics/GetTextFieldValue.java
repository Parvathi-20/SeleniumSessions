package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFieldValue {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		WebElement emailID = driver.findElement(By.id("input-email"));
		emailID.sendKeys("test@gmail.com");
		String text = emailID.getAttribute("value");
		System.out.println(text);

		driver.quit();

	}

}
