package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandleWithSelectTag {

	public static void main(String[] args) {
		
		
		// drop down -- html tag = <select>
		// Select class
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By country = By.id("Form_getForm_Country");
		WebElement ele = driver.findElement(country);
		
		Select select = new Select(ele);
		select.selectByIndex(5);
		select.selectByVisibleText("Afghanistan");
		select.selectByValue("Northern Mariana Islands");
	}

}
