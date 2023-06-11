package seleniumTopics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");

		Thread.sleep(5000);

//		driver.findElement(By.xpath("//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();		

		selectUser("Joe.Root");
		selectUser("Kevin.Mathews");

		List<String> JasmineDetails =  getUserInfo("Jasmine.Morgan");
		System.out.println(JasmineDetails);
	}

	public static void selectUser(String userName) {
		driver.findElement(
				By.xpath("//a[text()='" + userName + "']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
				.click();
	}

	public static List<String> getUserInfo(String userName) {
		List<WebElement> userdetails = driver
				.findElements(By.xpath("//a[text()='" + userName + "']/parent::td/following-sibling::td"));
		List<String> userInfo = new ArrayList<String>();
		for (WebElement e : userdetails) {
			String text = e.getText();
			userInfo.add(text);
		}
		return userInfo;
	}

}
