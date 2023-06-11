package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptClickAndSendKeys {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		Thread.sleep(3000);
		
		 WebElement ele = driver.findElement(By.id("persistent"));
//		 ele.click();
		
//		 Actions a = new Actions(driver);
//		 a.click(ele).build().perform();
		 
		 JavaScriptUtil jsutil = new JavaScriptUtil(driver);
		 jsutil.clickElementByJS(ele);
		 
		 jsutil.sendKeysUsingWithId("login-username", "test@ymail.com");
		 

	}

}
