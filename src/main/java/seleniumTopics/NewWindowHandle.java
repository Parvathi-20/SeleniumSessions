package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowHandle {

	public static void main(String[] args) throws InterruptedException {

//		WebDriver driver = new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
//		Thread.sleep(2000);
//		String winID = driver.getWindowHandle();
//		driver.switchTo().window(winID);
//		String tabUrl = driver.getCurrentUrl();
//		
//		
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get(tabUrl);
//		Thread.sleep(2000);
//
//		driver.switchTo().newWindow((WindowType.WINDOW));
//		driver.get("https://www.google.com");
		
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");// parent page
		String parentWindowId = driver.getWindowHandle();
		
		//sel 4.x:
		//driver.switchTo().newWindow(WindowType.TAB); //open a blank tab
		
		driver.switchTo().newWindow(WindowType.WINDOW); //open a new window
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());	
		
	}

}
