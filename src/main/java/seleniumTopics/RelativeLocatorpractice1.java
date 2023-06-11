package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class RelativeLocatorpractice1 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
/*		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		WebElement e = driver.findElement(By.xpath("//label[normalize-space()='Yes']"));
		
//		WebElement e = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
//		WebElement e = driver.findElement(By.linkText("Privacy Policy"));

		
		driver.findElement(with(By.cssSelector("input[type][value='1'][name='agree']")).toRightOf(e)).click();
*/

	
//		driver.get("https://support.formsite.com/hc/en-us/articles/360000112414-Notifications");
//
//		WebElement e = driver.findElement(By.xpath("//a[@title='No']"));
//				
//		driver.findElement(with(By.xpath("//a[contains(@class,'article-vote-up')]")).toLeftOf(e)).click();


		driver.get("https://spiceclub.spicejet.com/signup");

		Thread.sleep(5000);
		
		WebElement e = driver.findElement(By.cssSelector("label.form-check-label"));
				
		driver.findElement(with(By.xpath("//input[@id='defaultCheck1']")).toLeftOf(e)).click();

		
	}

}
