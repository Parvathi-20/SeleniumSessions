package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrollingConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://spicejet.woohoo.in/father-s-day");
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		
//		act.sendKeys(Keys.PAGE_DOWN).build().perform();
//		act.sendKeys(Keys.PAGE_DOWN).build().perform();
//		act.sendKeys(Keys.PAGE_DOWN).build().perform();
//		act.sendKeys(Keys.PAGE_DOWN).build().perform();
//		Thread.sleep(2500);
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();


		WebElement ele = driver.findElement(By.xpath("//div[@id='senderForm']//input[@type='tel']"));
		act.sendKeys(ele,"9898997979").build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.SPACE).build().perform();
		
		
			

	/*	//refresh the page:
		act.keyDown(Keys.COMMAND).sendKeys(Keys.F5).keyUp(Keys.COMMAND).build().perform();
		
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String s1 = "Pooja";
		String s2 = "Hegde";
		StringBuffer s3 = new StringBuffer("Testing");
		StringBuilder s4 = new StringBuilder("Automation");

		driver.findElement(By.name("search")).sendKeys(s1 + " "+ s2 + " " + s3 + " " + s4);
		//driver.findElement(By.name("search")).sendKeys(null);
		//IllegalArgumentException: Keys to send should be a not null CharSequence
		
		driver.findElement(By.xpath("//input[@value='Login']")).sendKeys("testing");
		//no exception
		
		driver.findElement(By.id("input-email")).click();//no exception
	*/
		
		
		//disable text field -- send keys
		//disable button -- click on it
	
//		driver.findElement(By.xpath("//input[contains(@placeholder,'Receiver' ) and contains(@placeholder,'Name')]")).sendKeys("testdisabled");
//		ElementNotInteractableException:
		
	}

}
