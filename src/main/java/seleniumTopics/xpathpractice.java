package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathpractice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		
		
		driver.findElement(By.xpath("//input[@name='test']/preceding-sibling::label")).click();
	
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@placeholder='First Enter name' ]")).sendKeys("testfname");

		JavascriptExecutor js = (JavascriptExecutor)driver; 
		WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Enter Last name']"));
		js.executeScript("arguments[0].disabled = false", lastName);
		
		lastName.sendKeys("Hegde");
		
	}

}
