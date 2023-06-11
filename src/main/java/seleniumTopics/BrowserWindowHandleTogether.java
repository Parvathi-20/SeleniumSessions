package seleniumTopics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleTogether {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		String parentwinId = driver.getWindowHandle();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		while (it.hasNext()) {
			String WindowID = it.next();
			driver.switchTo().window(WindowID);
			String url = driver.getCurrentUrl();
			System.out.println(url);
			Thread.sleep(1000);

			if (!WindowID.equals(parentwinId)) {
				driver.close();
			}
		}
		
		driver.switchTo().window(parentwinId);
		System.out.println(driver.getCurrentUrl());

	}

}
