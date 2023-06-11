package seleniumTopics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		String parentWindow = it.next();
		String childWindow = it.next();
		
		System.out.println("parent window handle id is " + parentWindow);
		System.out.println("child window handle id is " + childWindow);

		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		
		
		

	}

}
