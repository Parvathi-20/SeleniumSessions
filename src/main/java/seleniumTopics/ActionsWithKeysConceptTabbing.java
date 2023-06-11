package seleniumTopics;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsWithKeysConceptTabbing {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		
//		WebElement ele = driver.findElement(By.id("input-firstname"));
//		
		Actions act = new Actions(driver);
//		act.sendKeys(ele, "Parvathi")
//			.sendKeys(Keys.TAB)
//			.pause(200)
//			.sendKeys("Mesta")
//			.sendKeys(Keys.TAB)
//			.pause(200)
//			.sendKeys("test@gmail.com")
//			.sendKeys(Keys.TAB)
//			.pause(200)
//			.sendKeys("9898998989")
//			.build().perform();
	
		
		driver.get("https://www.amazon.com/");

		Action action = act.sendKeys(Keys.TAB)
			.sendKeys(Keys.TAB)
			  .sendKeys(Keys.TAB)
			  .sendKeys(Keys.TAB)
			  .sendKeys(Keys.TAB)
			  	.sendKeys("MAcbook Pro")
			  		.sendKeys(Keys.ENTER)			  
			  .build();
		action.perform();
		
		//Actions - class -- all actions method and build()
		//Action - interface -- perform();
		
		
	}
	

}
