package seleniumTopics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleWithList {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		
		Set<String> handles = driver.getWindowHandles();
		List<String> handlesList = new ArrayList<String>(handles);
		
		String parentWindID = handlesList.get(0);
		String childWinID = handlesList.get(1);

		driver.switchTo().window(childWinID);
		System.out.println(driver.getCurrentUrl());

		driver.switchTo().window(parentWindID);
		System.out.println(driver.getCurrentUrl());

		
	}

}
